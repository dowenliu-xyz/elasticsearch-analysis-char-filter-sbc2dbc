package xyz.dowenwork.elasticsearch.indices.analysis;

import org.elasticsearch.common.component.AbstractComponent;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.analysis.CharFilterFactory;
import org.elasticsearch.index.analysis.PreBuiltCharFilterFactoryFactory;
import org.elasticsearch.indices.analysis.IndicesAnalysisService;
import xyz.dowenwork.lucene.analyzer.SBC2DBCCaseCharFilter;

import java.io.Reader;

/**
 * <p>create at 16-6-2</p>
 *
 * @author liufl
 * @since 2.3.3.0
 */
public class Sbc2dbcAnalysis extends AbstractComponent {
    @Inject
    public Sbc2dbcAnalysis(Settings settings, IndicesAnalysisService indicesAnalysisService) {
        super(settings);
        indicesAnalysisService.charFilterFactories().put("sbc2dbc", new PreBuiltCharFilterFactoryFactory(
                new CharFilterFactory() {
                    @Override
                    public String name() {
                        return "sbc2dbc";
                    }

                    @Override
                    public Reader create(Reader tokenStream) {
                        return new SBC2DBCCaseCharFilter(tokenStream);
                    }
                }));
    }
}

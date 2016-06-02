package xyz.dowenwork.elasticsearch.index.analysis;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.analysis.AbstractCharFilterFactory;
import org.elasticsearch.index.settings.IndexSettingsService;
import xyz.dowenwork.lucene.analyzer.SBC2DBCCaseCharFilter;

import java.io.Reader;

/**
 * <p>create at 16-6-2</p>
 *
 * @author liufl
 * @since 2.3.3.0
 */
public class SBC2DBCCharFilterFactory extends AbstractCharFilterFactory {
    @Inject
    public SBC2DBCCharFilterFactory(Index index,
            IndexSettingsService indexSettingsService, String name) {
        super(index, indexSettingsService.indexSettings(), name);
    }

    @Override
    public Reader create(Reader tokenStream) {
        return new SBC2DBCCaseCharFilter(tokenStream);
    }
}

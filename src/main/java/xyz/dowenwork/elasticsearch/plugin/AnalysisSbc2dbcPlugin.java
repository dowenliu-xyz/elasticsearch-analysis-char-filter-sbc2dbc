package xyz.dowenwork.elasticsearch.plugin;

import org.elasticsearch.index.analysis.CharFilterFactory;
import org.elasticsearch.indices.analysis.AnalysisModule;
import org.elasticsearch.plugins.AnalysisPlugin;
import org.elasticsearch.plugins.Plugin;
import xyz.dowenwork.elasticsearch.index.analysis.SBC2DBCCharFilterFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>create at 16-6-2</p>
 *
 * @author liufl
 * @since 2.3.3.0
 */
@SuppressWarnings("unused")
public class AnalysisSbc2dbcPlugin extends Plugin implements AnalysisPlugin {
    @Override
    public Map<String, AnalysisModule.AnalysisProvider<CharFilterFactory>> getCharFilters() {
        Map<String, AnalysisModule.AnalysisProvider<CharFilterFactory>> factories = new HashMap<>();

        factories.put("sbc2dbc", (indexSettings, environment, name, settings) -> new SBC2DBCCharFilterFactory(indexSettings, name));

        return factories;
    }
}

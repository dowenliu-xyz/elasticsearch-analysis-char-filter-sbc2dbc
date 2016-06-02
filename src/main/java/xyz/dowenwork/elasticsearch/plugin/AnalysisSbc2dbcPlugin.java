package xyz.dowenwork.elasticsearch.plugin;

import org.elasticsearch.common.inject.Module;
import org.elasticsearch.index.analysis.AnalysisModule;
import org.elasticsearch.plugins.Plugin;
import xyz.dowenwork.elasticsearch.index.analysis.Sbc2dbcAnalysisBinderProcessor;
import xyz.dowenwork.elasticsearch.indices.analysis.Sbc2dbcAnalysisModule;

import java.util.Collection;
import java.util.Collections;

/**
 * <p>create at 16-6-2</p>
 *
 * @author liufl
 * @since 2.3.3.0
 */
@SuppressWarnings("unused")
public class AnalysisSbc2dbcPlugin extends Plugin {
    @Override
    public String name() {
        return "analysis-sbc2dbc";
    }

    @Override
    public String description() {
        return "全角字符转半角字符";
    }

    @Override
    public Collection<Module> nodeModules() {
        return Collections.<Module>singletonList(new Sbc2dbcAnalysisModule());
    }

    /**
     * Automatically called with the analysis module.
     */
    public void onModule(AnalysisModule module) {
        module.addProcessor(new Sbc2dbcAnalysisBinderProcessor());
    }
}

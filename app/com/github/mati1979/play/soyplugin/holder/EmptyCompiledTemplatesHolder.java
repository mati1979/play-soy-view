package com.github.mati1979.play.soyplugin.holder;

import java.util.Optional;
import com.google.template.soy.tofu.SoyTofu;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: mati
 * Date: 02/11/2013
 * Time: 14:24
 */
public class EmptyCompiledTemplatesHolder implements CompiledTemplatesHolder {

    @Override
    public Optional<SoyTofu> compiledTemplates() throws IOException {
        return Optional.empty();
    }

}

/*
 * Copyright 2018-2018 Michał Piotr Stankiewicz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pl.mpsk2.aspplugin.tree;

import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.structureView.impl.common.PsiTreeElementBase;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.psi.PsiElement;
import com.intellij.util.containers.ContainerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pl.mpsk2.aspplugin.psi.ASPDefine;
import pl.mpsk2.aspplugin.psi.ASPFile;
import pl.mpsk2.aspplugin.psi.statement.ASPStatement;

import java.util.Collection;
import java.util.List;

public class ASPStructureViewElement extends PsiTreeElementBase<PsiElement> {
    private final static Logger LOGGER = Logger.getInstance(ASPStructureViewElement.class);

    public ASPStructureViewElement(@NotNull PsiElement e) {
        super(e);
    }

    @NotNull
    @Override
    public Collection<StructureViewTreeElement> getChildrenBase() {
        List<StructureViewTreeElement> result = ContainerUtil.newArrayList();
        PsiElement element = getElement();
        if (element instanceof ASPFile) {
            for (ASPStatement o : ((ASPFile) element).getStatements())
                result.add(new ASPStructureViewElement(o));
            ASPDefine define = ((ASPFile) element).getDefine();
            if (define != null) {
                result.add(new ASPStructureViewElement(define));
            }
        }
        return result;
    }

    @Nullable
    @Override
    public String getPresentableText() {
        String textInner = getPresentationTextInner();
        return textInner != null
                ? textInner.replaceAll("\\(\\n", "(").replaceAll("\\n\\)", ")")
                : null;
    }

    @Nullable
    private String getPresentationTextInner() {
        PsiElement element = getElement();
        if (element == null) {
            return null;
        }
        if (element instanceof ASPFile) {
            return ((ASPFile) element).getName();
        }
        if (element instanceof ASPStatement) {
            return "stmt: " + element.getText();
        }
        if (element instanceof ASPDefine) {
            return "def: " + element.getText();
        }
        return null;
    }
}

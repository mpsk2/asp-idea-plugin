/*
 * Copyright 2018 Michał Piotr Stankiewicz
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

// This is a generated file. Not intended for manual editing.
package pl.mpsk2.aspplugin.psi.impl.theory;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import pl.mpsk2.aspplugin.psi.ASPPsiTreeUtil;

import static pl.mpsk2.aspplugin.psi.ASPTypes.*;

import pl.mpsk2.aspplugin.psi.impl.ASPCompositeElementImpl;
import pl.mpsk2.aspplugin.psi.theory.*;
import pl.mpsk2.aspplugin.psi.ASPVisitor;
import pl.mpsk2.aspplugin.psi.impl.ASPPsiImplUtil;

public class ASPTheoryAtomDefinitionImpl extends ASPCompositeElementImpl implements ASPTheoryAtomDefinition {

    public ASPTheoryAtomDefinitionImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull ASPVisitor visitor) {
        visitor.visitTheoryAtomDefinition(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof ASPVisitor) accept((ASPVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public ASPTheoryAtomType getTheoryAtomType() {
        return findChildByClass(ASPTheoryAtomType.class);
    }

    @Override
    @NotNull
    public List<ASPTheoryDefinitionIdentifier> getTheoryDefinitionIdentifierList() {
        return ASPPsiTreeUtil.getChildrenOfTypeAsList(this, ASPTheoryDefinitionIdentifier.class);
    }

    @Override
    @Nullable
    public ASPTheoryOperatorList getTheoryOperatorList() {
        return findChildByClass(ASPTheoryOperatorList.class);
    }

    @Override
    @Nullable
    public PsiElement getAnd() {
        return findChildByType(AND);
    }

    @Override
    @Nullable
    public PsiElement getColon() {
        return findChildByType(COLON);
    }

    @Override
    @Nullable
    public PsiElement getLbrace() {
        return findChildByType(LBRACE);
    }

    @Override
    @Nullable
    public PsiElement getRbrace() {
        return findChildByType(RBRACE);
    }

    @Override
    @Nullable
    public PsiElement getSlash() {
        return findChildByType(SLASH);
    }

    @Override
    @Nullable
    public PsiElement getNumber() {
        return findChildByType(NUMBER);
    }

}

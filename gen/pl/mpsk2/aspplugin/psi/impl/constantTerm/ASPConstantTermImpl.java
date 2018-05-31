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
package pl.mpsk2.aspplugin.psi.impl.constantTerm;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import pl.mpsk2.aspplugin.psi.ASPPsiTreeUtil;

import static pl.mpsk2.aspplugin.psi.ASPTypes.*;

import pl.mpsk2.aspplugin.psi.impl.ASPCompositeElementImpl;
import pl.mpsk2.aspplugin.psi.constantTerm.*;
import pl.mpsk2.aspplugin.psi.ASPVisitor;
import pl.mpsk2.aspplugin.psi.impl.ASPPsiImplUtil;

public abstract class ASPConstantTermImpl extends ASPCompositeElementImpl implements ASPConstantTerm {

    public ASPConstantTermImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull ASPVisitor visitor) {
        visitor.visitConstantTerm(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof ASPVisitor) accept((ASPVisitor) visitor);
        else super.accept(visitor);
    }

}

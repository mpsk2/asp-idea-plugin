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
package pl.mpsk2.aspplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import pl.mpsk2.aspplugin.psi.ASPPsiTreeUtil;
import static pl.mpsk2.aspplugin.psi.ASPTypes.*;
import pl.mpsk2.aspplugin.psi.*;

public class ASPIdTermImpl extends ASPTermImpl implements ASPIdTerm {

  public ASPIdTermImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ASPVisitor visitor) {
    visitor.visitIdTerm(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ASPVisitor) accept((ASPVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ASPArgVec getArgVec() {
    return findNotNullChildByClass(ASPArgVec.class);
  }

  @Override
  @NotNull
  public ASPIdentifier getIdentifier() {
    return findNotNullChildByClass(ASPIdentifier.class);
  }

  @Override
  @Nullable
  public PsiElement getAt() {
    return findChildByType(AT);
  }

  @Override
  @NotNull
  public PsiElement getLparen() {
    return findNotNullChildByType(LPAREN);
  }

  @Override
  @NotNull
  public PsiElement getRparen() {
    return findNotNullChildByType(RPAREN);
  }

}

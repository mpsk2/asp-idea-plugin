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
package pl.mpsk2.aspplugin.psi.theory;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import pl.mpsk2.aspplugin.psi.term.ASPTerm;
import pl.mpsk2.aspplugin.psi.ASPIdentifier;

public interface ASPTheoryTerm extends ASPTerm {

    @Nullable
    ASPIdentifier getIdentifier();

    @Nullable
    ASPTerm getTerm();

    @Nullable
    ASPTheoryOpTermList getTheoryOpTermList();

    @Nullable
    PsiElement getComma();

    @Nullable
    PsiElement getInfimum();

    @Nullable
    PsiElement getLbrace();

    @Nullable
    PsiElement getLbrack();

    @Nullable
    PsiElement getLparen();

    @Nullable
    PsiElement getRbrace();

    @Nullable
    PsiElement getRbrack();

    @Nullable
    PsiElement getRparen();

    @Nullable
    PsiElement getSupremum();

    @Nullable
    PsiElement getNumber();

    @Nullable
    PsiElement getString();

    @Nullable
    PsiElement getVariable();

}

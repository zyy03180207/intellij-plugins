package com.jetbrains.typoscript.lang.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;


public class TypoScriptCompositeElementImpl extends ASTWrapperPsiElement implements TypoScriptCompositeElement {

  public TypoScriptCompositeElementImpl(@NotNull final ASTNode node) {
    super(node);
  }

  @Override
  public IElementType getTokenType() {
    return getNode().getElementType();
  }
}

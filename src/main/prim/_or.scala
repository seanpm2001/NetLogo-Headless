// (C) Uri Wilensky. https://github.com/NetLogo/NetLogo

package org.nlogo.prim

import org.nlogo.core.{Pure, Syntax, prim}
import org.nlogo.nvm.{ Context, Reporter, CustomGenerated }

class _or extends Reporter with Pure with CustomGenerated {
  override def returnType =
    Syntax.BooleanType
  override def report(context: Context): java.lang.Boolean =
    if (argEvalBooleanValue(context, 0))
      java.lang.Boolean.TRUE
    else
      argEvalBoolean(context, 1)
}

// (C) Uri Wilensky. https://github.com/NetLogo/NetLogo

package org.nlogo.prim.etc

import org.nlogo.core.{Pure, AgentKind, prim}
import org.nlogo.agent.{ AgentSet, Turtle }
import org.nlogo.nvm.{ Context, Reporter }

class _isturtleset extends Reporter with Pure {
  override def report(context: Context): java.lang.Boolean =
    Boolean.box(
      args(0).report(context) match {
        case set: AgentSet =>
          set.kind == AgentKind.Turtle
        case _ =>
          false
      })
}

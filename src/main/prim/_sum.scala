// (C) Uri Wilensky. https://github.com/NetLogo/NetLogo

package org.nlogo.prim

import org.nlogo.core.{Pure, LogoList}
import org.nlogo.nvm.{ Reporter, Context }

class _sum extends Reporter with Pure {

  override def report(context: Context): java.lang.Double =
    Double.box(report_1(context, argEvalList(context, 0)))

  def report_1(context: Context, l0: LogoList): Double = {
    var sum = 0d
    val it = l0.iterator
    while(it.hasNext)
      it.next() match {
        case d: java.lang.Double =>
          sum += d.doubleValue
        case _ => // ignore
      }
    validDouble(sum)
  }

}

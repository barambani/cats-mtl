package cats
package mtl
package hierarchy

import cats.mtl.monad.{Asking, Scoping}

object BaseHierarchy {

  trait BH0 extends BH1 {
    implicit def askFromLocal[F[_], E](local: Scoping[F, E]): Asking[F, E] = local.ask

  }

  trait BH1 {

  }
}

package example

import cats.effect.{ExitCode, IO, IOApp}
import org.http4s.server.blaze.BlazeBuilder


object Hello extends IOApp {
  def stream: fs2.Stream[IO, ExitCode] = BlazeBuilder[IO]
    .bindHttp(8080, "0.0.0.0")
    /*.mountService(services, "/api")*/.serve

  override def run(args: List[String]): IO[ExitCode] = stream.compile.toList.map(_.head)

}
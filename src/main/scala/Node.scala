import scala.collection.mutable.ArrayBuffer

case class Node(children: String) {
  var kids = new ArrayBuffer[Node]

  def addChildren(c: Node): Unit = kids = kids :+ c

  def display(n: Int): Unit = {
    val child = children

    println(" " * 4 * n + "+- " + child)
    kids.foreach(_.display(n + 1))
  }
}

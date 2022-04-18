import scala.collection.mutable.ArrayBuffer

case class Node(children: String) {
  var kids = new ArrayBuffer[Node]

  def addChildren(c: Node): Unit = kids = kids :+ c
}

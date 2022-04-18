object Main extends App {

  val parent = Node("AdaptiveSparkPlan")
  val kid1 = Node("Union")
  val kid2 = Node("HashAggregate_1")
  val kid3 = Node("HashAggregate_2")
  val grandKids = kid1.addChildren(Node("Exchange"))

  parent.addChildren(kid1)
  parent.addChildren(kid2)
  parent.addChildren(kid3)

  println(parent)
  println(parent.addChildren(kid1))
  println(parent.addChildren(kid2))
  println(parent.addChildren(kid3))
}

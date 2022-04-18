object Main extends App {

  val parent = Node("AdaptiveSparkPlan")
  val kid1 = Node("Union")
  val kid2 = Node("HashAggregate_1")
  val grandKids = kid1.addChildren(Node("Exchange"))

  parent.addChildren(kid1)
  parent.addChildren(kid2)

  parent.display(2)
}

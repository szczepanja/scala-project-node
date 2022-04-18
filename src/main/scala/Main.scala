object Main extends App {

  val parent = Node("AdaptiveSparkPlan")
  val kid = Node("Union")
  val kid1 = Node("HashAggregate_1")
  val kid2 = Node("HashAggregate_2")
  val grandKids = Node("Exchange")
  val ggKids = Node("HashAggregate")
  val gggKids = Node("Project")
  val ggggKids = Node("Range")

  parent.addChildren(kid)
  kid.addChildren(kid1)
  kid2.addChildren(grandKids)
  grandKids.addChildren(ggKids)
  ggKids.addChildren(gggKids)
  gggKids.addChildren(ggggKids)
  kid.addChildren(kid2)
  kid1.addChildren(grandKids)

  parent.display(5)
}

package model

/**
 * Created with IntelliJ IDEA.
 * User: jhawkins
 * Date: 3/24/13
 * Time: 10:11 AM
 * To change this template use File | Settings | File Templates.
 */
class Player(name: String) {
  val x = name

  override def toString(): String = x
}

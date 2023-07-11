/*
multiple inheritance
super can be used for parent class not for parent interface.
 */
class A{

}
interface B{

}
interface C{

}
class D extends A implements B,C{
    //can't change the order
}

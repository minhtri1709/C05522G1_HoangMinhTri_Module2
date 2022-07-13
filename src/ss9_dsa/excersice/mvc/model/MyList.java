package ss9_dsa.excersice.mvc.model;

public  class MyList<E> {
  protected int size = 0;
  protected static final int DEFAULT_CAPACITY = 10;
  protected Object elements[];


  public MyList(int capacity) {
    if (capacity >= 0) {
      elements = new Object[capacity];
    }else{
      throw new IllegalArgumentException("capacity: " + capacity);
    }
  }

  public MyList(){
    elements = new Object[DEFAULT_CAPACITY];
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public Object[] getElements() {
    return elements;
  }




  public void setElements(Object[] elements) {
    this.elements = elements;
  }
}

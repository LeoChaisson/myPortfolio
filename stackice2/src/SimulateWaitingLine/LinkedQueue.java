package SimulateWaitingLine;

public class LinkedQueue < T > implements
    QueueInterface < T > , java.io.Serializable
{
    private Node firstNode; // references node at front of queue
    private Node lastNode;  // references node at back of queue

    public LinkedQueue ()
    {
        firstNode = null;
        lastNode = null;
    } // end default constructor


    public void enqueue (T newEntry)
    {
        Node newNode = new Node (newEntry, null);
        if (isEmpty ())
            firstNode = newNode;
        else
            lastNode.setNextNode (newNode);
        lastNode = newNode;
    } // end enqueue


    public T getFront ()
    {
        T front = null;
        if (!isEmpty ())
            front = firstNode.getData ();
        return front;
    } // end getFront


    public T dequeue ()
    {
        T front = null;
        if (!isEmpty ())
        {
            front = firstNode.getData ();
            firstNode = firstNode.getNextNode ();
            if (firstNode == null)
                lastNode = null;
        } // end if
        return front;
    } // end dequeue


    public boolean isEmpty ()
    {
        return (firstNode == null) && (lastNode == null);
    } // end isEmpty


    public void clear ()
    {
        firstNode = null;
        lastNode = null;
    } // end clear


    private class Node implements java.io.Serializable
    {
        private T data; // entry in queue
        private Node next; // link to next node

       // Constructors
        public Node(T inData,Node inNext) {
                setData(inData);
                setNextNode(inNext);
        }

        public T getData() { return data; }
        public void setData(T inData) { data = inData; }
        public Node getNextNode() { return next; }
        public void setNextNode(Node inNext) { next = inNext; }
    } // end Node
} // end LinkedQueue
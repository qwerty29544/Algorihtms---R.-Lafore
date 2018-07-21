package LinkQueue;

import LinkStack.LinkList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.*;

public class LinkQueueTest {

    Link link, linker;
    FirstLastList linkList, linkedList;
    LinkQueue linkQueue, linkedQueue;

    @Before
    public void setUp() throws Exception {
        this.linkedQueue = new LinkQueue();
        this.linkQueue = new LinkQueue();
        this.linkQueue.insert(234);
        this.linkQueue.insert(948);
        this.linkQueue.insert(-120);
    }

    @After
    public void tearDown() throws Exception {
        this.linkQueue = null;
        this.linkedQueue = null;
    }

    @Test
    public void isEmpty() throws Exception {
        assertEquals(this.linkedQueue.isEmpty(),true);
        for (int i=0; i<3; i++) {
            assertEquals(this.linkQueue.isEmpty(),false);
            this.linkQueue.remove();
        }
        assertEquals(this.linkQueue.isEmpty(),true);
    }

    @Test
    public void insert() throws Exception {
        assertEquals(this.linkedQueue.isEmpty(),true);
        this.linkedQueue.insert(2345);
        this.linkList = this.linkedQueue.getTheList();
        this.link = this.linkList.getFirst();
        assertEquals(this.link.getdData(),2345);
    }

    @Test
    public void remove() throws Exception {
        this.linkList = this.linkQueue.getTheList();
        this.link = this.linkList.getFirst();
        assertEquals(this.link.getdData(),234);
        this.linkQueue.remove();
        this.linkedList = this.linkQueue.getTheList();
        this.linker = this.linkList.getFirst();
        assertEquals(this.linker.getdData(),948);
        assertNotSame(this.linker,this.link);
    }

    @Test(expected = NullPointerException.class)
    public void removeException() {
        this.linkedQueue.remove();
    }

    @Test
    public void displayQueue() throws Exception {
        this.linkQueue.displayQueue();
        System.out.println("After Action with queue");
        this.linkQueue.insert(1293);
        this.linkQueue.insert(-203);
        this.linkQueue.remove();
        this.linkQueue.displayQueue();
    }

    @Test
    public void getTheList() throws Exception {
        this.linkList = this.linkQueue.getTheList();
        assertNotNull(this.linkList);
    }


}
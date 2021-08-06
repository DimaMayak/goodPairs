import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void testSolution() throws Exception {
        int [] nums ={1,2,3,1,1,3};
        int [] nums1 ={1,1,1,1};
        int [] nums2 ={1,2,3};
        assertEquals(4,Solution.numIdenticalPairs(nums));
        assertEquals(6,Solution.numIdenticalPairs(nums1));
        assertEquals(0,Solution.numIdenticalPairs(nums2));
    }
}

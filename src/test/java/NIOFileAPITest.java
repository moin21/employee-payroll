import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOFileAPITest {
    /**
     * HOME: user's home directory PLAY_WITH_NIO
     */
    private static String HOME = System.getProperty("user.home");

    /**
     * Test method to verify File Existence, File Deletion, Directory Creation and
     * Empty File Creation
     *
     * @throws IOException
     */
    @Test
    public void givenPathChecked_ThenConfirmed() throws IOException {
        /**
         * Path Creation: homePath
         */
        Path homePath = Paths.get(HOME);
        /**
         * Assertion that homePath exists
         */
        Assert.assertTrue(Files.exists(homePath));
        /**
         * Path Creation: playPath, path
         *
         */
        Path path = Paths.get(HOME + "/playDelete.txt");
        /**
         * Assertion if file path exists: It doesn't.
         */
        Assert.assertFalse(Files.exists(path));
        /**
         * Created empty file path
         */
        Files.createFile(path);
        /**
         * Asserting if file path exists: It does
         */
        Assert.assertTrue(Files.exists(path));
        /**
         * Deleted file path
         */
        Files.delete(path);
        /**
         * Asserting if file path exists: Already deleted
         */
        Assert.assertFalse(Files.exists(path));
    }

}
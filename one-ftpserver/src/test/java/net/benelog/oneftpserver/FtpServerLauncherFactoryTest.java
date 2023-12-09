package net.benelog.oneftpserver;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertTrue;


/**
 * @author benelog
 */
public class FtpServerLauncherFactoryTest {
  FtpServerLauncherFactory factory = new FtpServerLauncherFactory("", "");

  @Test
  public void testReadFromClassPath() throws IOException {
    File keyStore = factory.getKeyStoreFile("ftpkeystore.jks");
    assertTrue(keyStore.exists());
    assertTrue(keyStore.isFile());
  }
}

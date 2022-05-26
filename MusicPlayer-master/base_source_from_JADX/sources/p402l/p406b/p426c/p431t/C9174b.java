package p402l.p406b.p426c.p431t;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* renamed from: l.b.c.t.b */
/* compiled from: AbstractID3v1Tag */
public abstract class C9174b extends C9172a {

    /* renamed from: j */
    public static Logger f35813j = Logger.getLogger("org.jaudiotagger.tag.id3");

    /* renamed from: k */
    protected static Pattern f35814k = Pattern.compile("\\x00");

    /* renamed from: l */
    protected static final byte[] f35815l = {84, 65, 71};

    /* renamed from: p */
    public static boolean m48743p(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr, 0, 3);
        return Arrays.equals(bArr, f35815l);
    }

    /* renamed from: o */
    public void mo31852o(RandomAccessFile randomAccessFile) throws IOException {
        f35813j.config("Deleting ID3v1 from file if exists");
        FileChannel channel = randomAccessFile.getChannel();
        if (randomAccessFile.length() >= 128) {
            channel.position(randomAccessFile.length() - 128);
            ByteBuffer allocate = ByteBuffer.allocate(128);
            channel.read(allocate);
            allocate.rewind();
            if (m48743p(allocate)) {
                try {
                    f35813j.config("Deleted ID3v1 tag");
                    randomAccessFile.setLength(randomAccessFile.length() - 128);
                } catch (IOException e) {
                    Logger logger = f35813j;
                    logger.severe("Unable to delete existing ID3v1 Tag:" + e.getMessage());
                }
            } else {
                f35813j.config("Unable to find ID3v1 tag to deleteField");
            }
        } else {
            throw new IOException("File not not appear large enough to contain a tag");
        }
    }
}

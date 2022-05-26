package p082e.p134m.p135a;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.chad.library.adapter.base.BaseQuickAdapter;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: e.m.a.a */
/* compiled from: ExifInterface */
public class C4087a {

    /* renamed from: A */
    private static final byte[] f12295A = {79, 76, 89, 77, 80, 0};

    /* renamed from: B */
    private static final byte[] f12296B = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: C */
    private static final byte[] f12297C = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: D */
    private static final byte[] f12298D = {101, 88, 73, 102};

    /* renamed from: E */
    private static final byte[] f12299E = {73, 72, 68, 82};

    /* renamed from: F */
    private static final byte[] f12300F = {73, 69, 78, 68};

    /* renamed from: G */
    private static final byte[] f12301G = {82, 73, 70, 70};

    /* renamed from: H */
    private static final byte[] f12302H = {87, 69, 66, 80};

    /* renamed from: I */
    private static final byte[] f12303I = {69, 88, 73, 70};

    /* renamed from: J */
    private static SimpleDateFormat f12304J;

    /* renamed from: K */
    static final String[] f12305K = {BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: L */
    static final int[] f12306L = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: M */
    static final byte[] f12307M = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: N */
    private static final C4091d[] f12308N;

    /* renamed from: O */
    private static final C4091d[] f12309O;

    /* renamed from: P */
    private static final C4091d[] f12310P;

    /* renamed from: Q */
    private static final C4091d[] f12311Q;

    /* renamed from: R */
    private static final C4091d[] f12312R;

    /* renamed from: S */
    private static final C4091d f12313S = new C4091d("StripOffsets", BaseQuickAdapter.HEADER_VIEW, 3);

    /* renamed from: T */
    private static final C4091d[] f12314T;

    /* renamed from: U */
    private static final C4091d[] f12315U;

    /* renamed from: V */
    private static final C4091d[] f12316V;

    /* renamed from: W */
    private static final C4091d[] f12317W;

    /* renamed from: X */
    static final C4091d[][] f12318X;

    /* renamed from: Y */
    private static final C4091d[] f12319Y = {new C4091d("SubIFDPointer", 330, 4), new C4091d("ExifIFDPointer", 34665, 4), new C4091d("GPSInfoIFDPointer", 34853, 4), new C4091d("InteroperabilityIFDPointer", 40965, 4), new C4091d("CameraSettingsIFDPointer", 8224, 1), new C4091d("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: Z */
    private static final HashMap<Integer, C4091d>[] f12320Z;

    /* renamed from: a0 */
    private static final HashMap<String, C4091d>[] f12321a0;

    /* renamed from: b0 */
    private static final HashSet<String> f12322b0 = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: c0 */
    private static final HashMap<Integer, Integer> f12323c0 = new HashMap<>();

    /* renamed from: d0 */
    static final Charset f12324d0;

    /* renamed from: e0 */
    static final byte[] f12325e0;

    /* renamed from: f0 */
    private static final byte[] f12326f0;

    /* renamed from: r */
    private static final boolean f12327r = Log.isLoggable("ExifInterface", 3);

    /* renamed from: s */
    private static final List<Integer> f12328s = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: t */
    private static final List<Integer> f12329t = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: u */
    public static final int[] f12330u = {8, 8, 8};

    /* renamed from: v */
    public static final int[] f12331v = {8};

    /* renamed from: w */
    static final byte[] f12332w = {-1, -40, -1};

    /* renamed from: x */
    private static final byte[] f12333x = {102, 116, 121, 112};

    /* renamed from: y */
    private static final byte[] f12334y = {109, 105, 102, 49};

    /* renamed from: z */
    private static final byte[] f12335z = {104, 101, 105, 99};

    /* renamed from: a */
    private String f12336a;

    /* renamed from: b */
    private FileDescriptor f12337b;

    /* renamed from: c */
    private AssetManager.AssetInputStream f12338c;

    /* renamed from: d */
    private int f12339d;

    /* renamed from: e */
    private boolean f12340e;

    /* renamed from: f */
    private final HashMap<String, C4090c>[] f12341f;

    /* renamed from: g */
    private Set<Integer> f12342g;

    /* renamed from: h */
    private ByteOrder f12343h;

    /* renamed from: i */
    private boolean f12344i;

    /* renamed from: j */
    private int f12345j;

    /* renamed from: k */
    private int f12346k;

    /* renamed from: l */
    private int f12347l;

    /* renamed from: m */
    private int f12348m;

    /* renamed from: n */
    private int f12349n;

    /* renamed from: o */
    private int f12350o;

    /* renamed from: p */
    private int f12351p;

    /* renamed from: q */
    private int f12352q;

    /* renamed from: e.m.a.a$a */
    /* compiled from: ExifInterface */
    class C4088a extends MediaDataSource {

        /* renamed from: g */
        long f12353g;

        /* renamed from: h */
        final /* synthetic */ C4089b f12354h;

        C4088a(C4087a aVar, C4089b bVar) {
            this.f12354h = bVar;
        }

        public void close() throws IOException {
        }

        public long getSize() throws IOException {
            return -1;
        }

        public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f12353g;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) this.f12354h.available())) {
                        return -1;
                    }
                    this.f12354h.mo14182x(j);
                    this.f12353g = j;
                }
                if (i2 > this.f12354h.available()) {
                    i2 = this.f12354h.available();
                }
                int read = this.f12354h.read(bArr, i, i2);
                if (read >= 0) {
                    this.f12353g += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f12353g = -1;
            return -1;
        }
    }

    /* renamed from: e.m.a.a$b */
    /* compiled from: ExifInterface */
    private static class C4089b extends InputStream implements DataInput {

        /* renamed from: k */
        private static final ByteOrder f12355k = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: l */
        private static final ByteOrder f12356l = ByteOrder.BIG_ENDIAN;

        /* renamed from: g */
        private DataInputStream f12357g;

        /* renamed from: h */
        private ByteOrder f12358h;

        /* renamed from: i */
        final int f12359i;

        /* renamed from: j */
        int f12360j;

        public C4089b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: E */
        public void mo14160E(ByteOrder byteOrder) {
            this.f12358h = byteOrder;
        }

        public int available() throws IOException {
            return this.f12357g.available();
        }

        /* renamed from: c */
        public int mo14162c() {
            return this.f12359i;
        }

        /* renamed from: d */
        public int mo14163d() {
            return this.f12360j;
        }

        /* renamed from: p */
        public long mo14164p() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        public int read() throws IOException {
            this.f12360j++;
            return this.f12357g.read();
        }

        public boolean readBoolean() throws IOException {
            this.f12360j++;
            return this.f12357g.readBoolean();
        }

        public byte readByte() throws IOException {
            int i = this.f12360j + 1;
            this.f12360j = i;
            if (i <= this.f12359i) {
                int read = this.f12357g.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() throws IOException {
            this.f12360j += 2;
            return this.f12357g.readChar();
        }

        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f12360j + i2;
            this.f12360j = i3;
            if (i3 > this.f12359i) {
                throw new EOFException();
            } else if (this.f12357g.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() throws IOException {
            int i = this.f12360j + 4;
            this.f12360j = i;
            if (i <= this.f12359i) {
                int read = this.f12357g.read();
                int read2 = this.f12357g.read();
                int read3 = this.f12357g.read();
                int read4 = this.f12357g.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f12358h;
                    if (byteOrder == f12355k) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f12356l) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f12358h);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public long readLong() throws IOException {
            int i = this.f12360j + 8;
            this.f12360j = i;
            if (i <= this.f12359i) {
                int read = this.f12357g.read();
                int read2 = this.f12357g.read();
                int read3 = this.f12357g.read();
                int read4 = this.f12357g.read();
                int read5 = this.f12357g.read();
                int read6 = this.f12357g.read();
                int read7 = this.f12357g.read();
                int read8 = this.f12357g.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f12358h;
                    if (byteOrder == f12355k) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    int i2 = read2;
                    if (byteOrder == f12356l) {
                        return (((long) read) << 56) + (((long) i2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    throw new IOException("Invalid byte order: " + this.f12358h);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() throws IOException {
            int i = this.f12360j + 2;
            this.f12360j = i;
            if (i <= this.f12359i) {
                int read = this.f12357g.read();
                int read2 = this.f12357g.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f12358h;
                    if (byteOrder == f12355k) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f12356l) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f12358h);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() throws IOException {
            this.f12360j += 2;
            return this.f12357g.readUTF();
        }

        public int readUnsignedByte() throws IOException {
            this.f12360j++;
            return this.f12357g.readUnsignedByte();
        }

        public int readUnsignedShort() throws IOException {
            int i = this.f12360j + 2;
            this.f12360j = i;
            if (i <= this.f12359i) {
                int read = this.f12357g.read();
                int read2 = this.f12357g.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f12358h;
                    if (byteOrder == f12355k) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f12356l) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f12358h);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.f12359i - this.f12360j);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.f12357g.skipBytes(min - i2);
            }
            this.f12360j += i2;
            return i2;
        }

        /* renamed from: x */
        public void mo14182x(long j) throws IOException {
            int i = this.f12360j;
            if (((long) i) > j) {
                this.f12360j = 0;
                this.f12357g.reset();
                this.f12357g.mark(this.f12359i);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        C4089b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f12358h = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f12357g = dataInputStream;
            int available = dataInputStream.available();
            this.f12359i = available;
            this.f12360j = 0;
            this.f12357g.mark(available);
            this.f12358h = byteOrder;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.f12357g.read(bArr, i, i2);
            this.f12360j += read;
            return read;
        }

        public void readFully(byte[] bArr) throws IOException {
            int length = this.f12360j + bArr.length;
            this.f12360j = length;
            if (length > this.f12359i) {
                throw new EOFException();
            } else if (this.f12357g.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public C4089b(byte[] bArr) throws IOException {
            this((InputStream) new ByteArrayInputStream(bArr));
        }
    }

    /* renamed from: e.m.a.a$c */
    /* compiled from: ExifInterface */
    private static class C4090c {

        /* renamed from: a */
        public final int f12361a;

        /* renamed from: b */
        public final int f12362b;

        /* renamed from: c */
        public final byte[] f12363c;

        C4090c(int i, int i2, byte[] bArr) {
            this(i, i2, -1, bArr);
        }

        /* renamed from: a */
        public static C4090c m18135a(String str) {
            byte[] bytes = (str + 0).getBytes(C4087a.f12324d0);
            return new C4090c(2, bytes.length, bytes);
        }

        /* renamed from: b */
        public static C4090c m18136b(long j, ByteOrder byteOrder) {
            return m18137c(new long[]{j}, byteOrder);
        }

        /* renamed from: c */
        public static C4090c m18137c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C4087a.f12306L[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C4090c(4, jArr.length, wrap.array());
        }

        /* renamed from: d */
        public static C4090c m18138d(C4092e eVar, ByteOrder byteOrder) {
            return m18139e(new C4092e[]{eVar}, byteOrder);
        }

        /* renamed from: e */
        public static C4090c m18139e(C4092e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C4087a.f12306L[5] * eVarArr.length)]);
            wrap.order(byteOrder);
            for (C4092e eVar : eVarArr) {
                wrap.putInt((int) eVar.f12368a);
                wrap.putInt((int) eVar.f12369b);
            }
            return new C4090c(5, eVarArr.length, wrap.array());
        }

        /* renamed from: f */
        public static C4090c m18140f(int i, ByteOrder byteOrder) {
            return m18141g(new int[]{i}, byteOrder);
        }

        /* renamed from: g */
        public static C4090c m18141g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C4087a.f12306L[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C4090c(3, iArr.length, wrap.array());
        }

        /* renamed from: h */
        public double mo14183h(ByteOrder byteOrder) {
            Object k = mo14186k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (k instanceof String) {
                return Double.parseDouble((String) k);
            } else {
                if (k instanceof long[]) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof double[]) {
                    double[] dArr = (double[]) k;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof C4092e[]) {
                    C4092e[] eVarArr = (C4092e[]) k;
                    if (eVarArr.length == 1) {
                        return eVarArr[0].mo14189a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        /* renamed from: i */
        public int mo14184i(ByteOrder byteOrder) {
            Object k = mo14186k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (k instanceof String) {
                return Integer.parseInt((String) k);
            } else {
                if (k instanceof long[]) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        /* renamed from: j */
        public String mo14185j(ByteOrder byteOrder) {
            Object k = mo14186k(byteOrder);
            if (k == null) {
                return null;
            }
            if (k instanceof String) {
                return (String) k;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (k instanceof long[]) {
                long[] jArr = (long[]) k;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k instanceof int[]) {
                int[] iArr = (int[]) k;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k instanceof double[]) {
                double[] dArr = (double[]) k;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(k instanceof C4092e[])) {
                return null;
            } else {
                C4092e[] eVarArr = (C4092e[]) k;
                while (i < eVarArr.length) {
                    sb.append(eVarArr[i].f12368a);
                    sb.append('/');
                    sb.append(eVarArr[i].f12369b);
                    i++;
                    if (i != eVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x01a3 A[SYNTHETIC, Splitter:B:164:0x01a3] */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo14186k(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                e.m.a.a$b r3 = new e.m.a.a$b     // Catch:{ IOException -> 0x018d, all -> 0x018b }
                byte[] r4 = r10.f12363c     // Catch:{ IOException -> 0x018d, all -> 0x018b }
                r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x018d, all -> 0x018b }
                r3.mo14160E(r11)     // Catch:{ IOException -> 0x0189 }
                int r11 = r10.f12361a     // Catch:{ IOException -> 0x0189 }
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L_0x0148;
                    case 2: goto L_0x00fd;
                    case 3: goto L_0x00e3;
                    case 4: goto L_0x00c9;
                    case 5: goto L_0x00a6;
                    case 6: goto L_0x0148;
                    case 7: goto L_0x00fd;
                    case 8: goto L_0x008c;
                    case 9: goto L_0x0072;
                    case 10: goto L_0x004d;
                    case 11: goto L_0x0032;
                    case 12: goto L_0x0018;
                    default: goto L_0x0016;
                }     // Catch:{ IOException -> 0x0189 }
            L_0x0016:
                goto L_0x0180
            L_0x0018:
                int r11 = r10.f12362b     // Catch:{ IOException -> 0x0189 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x001c:
                int r4 = r10.f12362b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x0029
                double r6 = r3.readDouble()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x001c
            L_0x0029:
                r3.close()     // Catch:{ IOException -> 0x002d }
                goto L_0x0031
            L_0x002d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0031:
                return r11
            L_0x0032:
                int r11 = r10.f12362b     // Catch:{ IOException -> 0x0189 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x0036:
                int r4 = r10.f12362b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x0044
                float r4 = r3.readFloat()     // Catch:{ IOException -> 0x0189 }
                double r6 = (double) r4     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x0036
            L_0x0044:
                r3.close()     // Catch:{ IOException -> 0x0048 }
                goto L_0x004c
            L_0x0048:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x004c:
                return r11
            L_0x004d:
                int r11 = r10.f12362b     // Catch:{ IOException -> 0x0189 }
                e.m.a.a$e[] r11 = new p082e.p134m.p135a.C4087a.C4092e[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x0051:
                int r4 = r10.f12362b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x0069
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0189 }
                long r6 = (long) r4     // Catch:{ IOException -> 0x0189 }
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0189 }
                long r8 = (long) r4     // Catch:{ IOException -> 0x0189 }
                e.m.a.a$e r4 = new e.m.a.a$e     // Catch:{ IOException -> 0x0189 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x0051
            L_0x0069:
                r3.close()     // Catch:{ IOException -> 0x006d }
                goto L_0x0071
            L_0x006d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0071:
                return r11
            L_0x0072:
                int r11 = r10.f12362b     // Catch:{ IOException -> 0x0189 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x0076:
                int r4 = r10.f12362b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x0083
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x0076
            L_0x0083:
                r3.close()     // Catch:{ IOException -> 0x0087 }
                goto L_0x008b
            L_0x0087:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008b:
                return r11
            L_0x008c:
                int r11 = r10.f12362b     // Catch:{ IOException -> 0x0189 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x0090:
                int r4 = r10.f12362b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x009d
                short r4 = r3.readShort()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x0090
            L_0x009d:
                r3.close()     // Catch:{ IOException -> 0x00a1 }
                goto L_0x00a5
            L_0x00a1:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a5:
                return r11
            L_0x00a6:
                int r11 = r10.f12362b     // Catch:{ IOException -> 0x0189 }
                e.m.a.a$e[] r11 = new p082e.p134m.p135a.C4087a.C4092e[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x00aa:
                int r4 = r10.f12362b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x00c0
                long r6 = r3.mo14164p()     // Catch:{ IOException -> 0x0189 }
                long r8 = r3.mo14164p()     // Catch:{ IOException -> 0x0189 }
                e.m.a.a$e r4 = new e.m.a.a$e     // Catch:{ IOException -> 0x0189 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x00aa
            L_0x00c0:
                r3.close()     // Catch:{ IOException -> 0x00c4 }
                goto L_0x00c8
            L_0x00c4:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00c8:
                return r11
            L_0x00c9:
                int r11 = r10.f12362b     // Catch:{ IOException -> 0x0189 }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x00cd:
                int r4 = r10.f12362b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x00da
                long r6 = r3.mo14164p()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x00cd
            L_0x00da:
                r3.close()     // Catch:{ IOException -> 0x00de }
                goto L_0x00e2
            L_0x00de:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00e2:
                return r11
            L_0x00e3:
                int r11 = r10.f12362b     // Catch:{ IOException -> 0x0189 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x00e7:
                int r4 = r10.f12362b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x00f4
                int r4 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x00e7
            L_0x00f4:
                r3.close()     // Catch:{ IOException -> 0x00f8 }
                goto L_0x00fc
            L_0x00f8:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00fc:
                return r11
            L_0x00fd:
                int r11 = r10.f12362b     // Catch:{ IOException -> 0x0189 }
                byte[] r6 = p082e.p134m.p135a.C4087a.f12307M     // Catch:{ IOException -> 0x0189 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0189 }
                if (r11 < r6) goto L_0x011a
                r11 = 0
            L_0x0105:
                byte[] r6 = p082e.p134m.p135a.C4087a.f12307M     // Catch:{ IOException -> 0x0189 }
                int r7 = r6.length     // Catch:{ IOException -> 0x0189 }
                if (r11 >= r7) goto L_0x0117
                byte[] r7 = r10.f12363c     // Catch:{ IOException -> 0x0189 }
                byte r7 = r7[r11]     // Catch:{ IOException -> 0x0189 }
                byte r8 = r6[r11]     // Catch:{ IOException -> 0x0189 }
                if (r7 == r8) goto L_0x0114
                r4 = 0
                goto L_0x0117
            L_0x0114:
                int r11 = r11 + 1
                goto L_0x0105
            L_0x0117:
                if (r4 == 0) goto L_0x011a
                int r5 = r6.length     // Catch:{ IOException -> 0x0189 }
            L_0x011a:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0189 }
                r11.<init>()     // Catch:{ IOException -> 0x0189 }
            L_0x011f:
                int r4 = r10.f12362b     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x013b
                byte[] r4 = r10.f12363c     // Catch:{ IOException -> 0x0189 }
                byte r4 = r4[r5]     // Catch:{ IOException -> 0x0189 }
                if (r4 != 0) goto L_0x012a
                goto L_0x013b
            L_0x012a:
                r6 = 32
                if (r4 < r6) goto L_0x0133
                char r4 = (char) r4     // Catch:{ IOException -> 0x0189 }
                r11.append(r4)     // Catch:{ IOException -> 0x0189 }
                goto L_0x0138
            L_0x0133:
                r4 = 63
                r11.append(r4)     // Catch:{ IOException -> 0x0189 }
            L_0x0138:
                int r5 = r5 + 1
                goto L_0x011f
            L_0x013b:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0189 }
                r3.close()     // Catch:{ IOException -> 0x0143 }
                goto L_0x0147
            L_0x0143:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0147:
                return r11
            L_0x0148:
                byte[] r11 = r10.f12363c     // Catch:{ IOException -> 0x0189 }
                int r6 = r11.length     // Catch:{ IOException -> 0x0189 }
                if (r6 != r4) goto L_0x016e
                byte r6 = r11[r5]     // Catch:{ IOException -> 0x0189 }
                if (r6 < 0) goto L_0x016e
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0189 }
                if (r11 > r4) goto L_0x016e
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0189 }
                char[] r4 = new char[r4]     // Catch:{ IOException -> 0x0189 }
                byte[] r6 = r10.f12363c     // Catch:{ IOException -> 0x0189 }
                byte r6 = r6[r5]     // Catch:{ IOException -> 0x0189 }
                int r6 = r6 + 48
                char r6 = (char) r6     // Catch:{ IOException -> 0x0189 }
                r4[r5] = r6     // Catch:{ IOException -> 0x0189 }
                r11.<init>(r4)     // Catch:{ IOException -> 0x0189 }
                r3.close()     // Catch:{ IOException -> 0x0169 }
                goto L_0x016d
            L_0x0169:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x016d:
                return r11
            L_0x016e:
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0189 }
                byte[] r4 = r10.f12363c     // Catch:{ IOException -> 0x0189 }
                java.nio.charset.Charset r5 = p082e.p134m.p135a.C4087a.f12324d0     // Catch:{ IOException -> 0x0189 }
                r11.<init>(r4, r5)     // Catch:{ IOException -> 0x0189 }
                r3.close()     // Catch:{ IOException -> 0x017b }
                goto L_0x017f
            L_0x017b:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x017f:
                return r11
            L_0x0180:
                r3.close()     // Catch:{ IOException -> 0x0184 }
                goto L_0x0188
            L_0x0184:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0188:
                return r2
            L_0x0189:
                r11 = move-exception
                goto L_0x018f
            L_0x018b:
                r11 = move-exception
                goto L_0x01a1
            L_0x018d:
                r11 = move-exception
                r3 = r2
            L_0x018f:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x019f }
                if (r3 == 0) goto L_0x019e
                r3.close()     // Catch:{ IOException -> 0x019a }
                goto L_0x019e
            L_0x019a:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x019e:
                return r2
            L_0x019f:
                r11 = move-exception
                r2 = r3
            L_0x01a1:
                if (r2 == 0) goto L_0x01ab
                r2.close()     // Catch:{ IOException -> 0x01a7 }
                goto L_0x01ab
            L_0x01a7:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01ab:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p134m.p135a.C4087a.C4090c.mo14186k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + C4087a.f12305K[this.f12361a] + ", data length:" + this.f12363c.length + ")";
        }

        C4090c(int i, int i2, long j, byte[] bArr) {
            this.f12361a = i;
            this.f12362b = i2;
            this.f12363c = bArr;
        }
    }

    /* renamed from: e.m.a.a$e */
    /* compiled from: ExifInterface */
    private static class C4092e {

        /* renamed from: a */
        public final long f12368a;

        /* renamed from: b */
        public final long f12369b;

        C4092e(long j, long j2) {
            if (j2 == 0) {
                this.f12368a = 0;
                this.f12369b = 1;
                return;
            }
            this.f12368a = j;
            this.f12369b = j2;
        }

        /* renamed from: a */
        public double mo14189a() {
            return ((double) this.f12368a) / ((double) this.f12369b);
        }

        public String toString() {
            return this.f12368a + "/" + this.f12369b;
        }
    }

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        "XMP ".getBytes(Charset.defaultCharset());
        C4091d[] dVarArr = {new C4091d("NewSubfileType", 254, 4), new C4091d("SubfileType", 255, 4), new C4091d("ImageWidth", 256, 3, 4), new C4091d("ImageLength", 257, 3, 4), new C4091d("BitsPerSample", 258, 3), new C4091d("Compression", 259, 3), new C4091d("PhotometricInterpretation", 262, 3), new C4091d("ImageDescription", 270, 2), new C4091d("Make", 271, 2), new C4091d("Model", 272, 2), new C4091d("StripOffsets", BaseQuickAdapter.HEADER_VIEW, 3, 4), new C4091d("Orientation", 274, 3), new C4091d("SamplesPerPixel", 277, 3), new C4091d("RowsPerStrip", 278, 3, 4), new C4091d("StripByteCounts", 279, 3, 4), new C4091d("XResolution", 282, 5), new C4091d("YResolution", 283, 5), new C4091d("PlanarConfiguration", 284, 3), new C4091d("ResolutionUnit", 296, 3), new C4091d("TransferFunction", 301, 3), new C4091d("Software", 305, 2), new C4091d("DateTime", 306, 2), new C4091d("Artist", 315, 2), new C4091d("WhitePoint", 318, 5), new C4091d("PrimaryChromaticities", 319, 5), new C4091d("SubIFDPointer", 330, 4), new C4091d("JPEGInterchangeFormat", 513, 4), new C4091d("JPEGInterchangeFormatLength", 514, 4), new C4091d("YCbCrCoefficients", 529, 5), new C4091d("YCbCrSubSampling", 530, 3), new C4091d("YCbCrPositioning", 531, 3), new C4091d("ReferenceBlackWhite", 532, 5), new C4091d("Copyright", 33432, 2), new C4091d("ExifIFDPointer", 34665, 4), new C4091d("GPSInfoIFDPointer", 34853, 4), new C4091d("SensorTopBorder", 4, 4), new C4091d("SensorLeftBorder", 5, 4), new C4091d("SensorBottomBorder", 6, 4), new C4091d("SensorRightBorder", 7, 4), new C4091d("ISO", 23, 3), new C4091d("JpgFromRaw", 46, 7), new C4091d("Xmp", 700, 1)};
        f12308N = dVarArr;
        C4091d[] dVarArr2 = {new C4091d("ExposureTime", 33434, 5), new C4091d("FNumber", 33437, 5), new C4091d("ExposureProgram", 34850, 3), new C4091d("SpectralSensitivity", 34852, 2), new C4091d("PhotographicSensitivity", 34855, 3), new C4091d("OECF", 34856, 7), new C4091d("SensitivityType", 34864, 3), new C4091d("StandardOutputSensitivity", 34865, 4), new C4091d("RecommendedExposureIndex", 34866, 4), new C4091d("ISOSpeed", 34867, 4), new C4091d("ISOSpeedLatitudeyyy", 34868, 4), new C4091d("ISOSpeedLatitudezzz", 34869, 4), new C4091d("ExifVersion", 36864, 2), new C4091d("DateTimeOriginal", 36867, 2), new C4091d("DateTimeDigitized", 36868, 2), new C4091d("OffsetTime", 36880, 2), new C4091d("OffsetTimeOriginal", 36881, 2), new C4091d("OffsetTimeDigitized", 36882, 2), new C4091d("ComponentsConfiguration", 37121, 7), new C4091d("CompressedBitsPerPixel", 37122, 5), new C4091d("ShutterSpeedValue", 37377, 10), new C4091d("ApertureValue", 37378, 5), new C4091d("BrightnessValue", 37379, 10), new C4091d("ExposureBiasValue", 37380, 10), new C4091d("MaxApertureValue", 37381, 5), new C4091d("SubjectDistance", 37382, 5), new C4091d("MeteringMode", 37383, 3), new C4091d("LightSource", 37384, 3), new C4091d("Flash", 37385, 3), new C4091d("FocalLength", 37386, 5), new C4091d("SubjectArea", 37396, 3), new C4091d("MakerNote", 37500, 7), new C4091d("UserComment", 37510, 7), new C4091d("SubSecTime", 37520, 2), new C4091d("SubSecTimeOriginal", 37521, 2), new C4091d("SubSecTimeDigitized", 37522, 2), new C4091d("FlashpixVersion", 40960, 7), new C4091d("ColorSpace", 40961, 3), new C4091d("PixelXDimension", 40962, 3, 4), new C4091d("PixelYDimension", 40963, 3, 4), new C4091d("RelatedSoundFile", 40964, 2), new C4091d("InteroperabilityIFDPointer", 40965, 4), new C4091d("FlashEnergy", 41483, 5), new C4091d("SpatialFrequencyResponse", 41484, 7), new C4091d("FocalPlaneXResolution", 41486, 5), new C4091d("FocalPlaneYResolution", 41487, 5), new C4091d("FocalPlaneResolutionUnit", 41488, 3), new C4091d("SubjectLocation", 41492, 3), new C4091d("ExposureIndex", 41493, 5), new C4091d("SensingMethod", 41495, 3), new C4091d("FileSource", 41728, 7), new C4091d("SceneType", 41729, 7), new C4091d("CFAPattern", 41730, 7), new C4091d("CustomRendered", 41985, 3), new C4091d("ExposureMode", 41986, 3), new C4091d("WhiteBalance", 41987, 3), new C4091d("DigitalZoomRatio", 41988, 5), new C4091d("FocalLengthIn35mmFilm", 41989, 3), new C4091d("SceneCaptureType", 41990, 3), new C4091d("GainControl", 41991, 3), new C4091d("Contrast", 41992, 3), new C4091d("Saturation", 41993, 3), new C4091d("Sharpness", 41994, 3), new C4091d("DeviceSettingDescription", 41995, 7), new C4091d("SubjectDistanceRange", 41996, 3), new C4091d("ImageUniqueID", 42016, 2), new C4091d("CameraOwnerName", 42032, 2), new C4091d("BodySerialNumber", 42033, 2), new C4091d("LensSpecification", 42034, 5), new C4091d("LensMake", 42035, 2), new C4091d("LensModel", 42036, 2), new C4091d("Gamma", 42240, 5), new C4091d("DNGVersion", 50706, 1), new C4091d("DefaultCropSize", 50720, 3, 4)};
        f12309O = dVarArr2;
        C4091d[] dVarArr3 = {new C4091d("GPSVersionID", 0, 1), new C4091d("GPSLatitudeRef", 1, 2), new C4091d("GPSLatitude", 2, 5), new C4091d("GPSLongitudeRef", 3, 2), new C4091d("GPSLongitude", 4, 5), new C4091d("GPSAltitudeRef", 5, 1), new C4091d("GPSAltitude", 6, 5), new C4091d("GPSTimeStamp", 7, 5), new C4091d("GPSSatellites", 8, 2), new C4091d("GPSStatus", 9, 2), new C4091d("GPSMeasureMode", 10, 2), new C4091d("GPSDOP", 11, 5), new C4091d("GPSSpeedRef", 12, 2), new C4091d("GPSSpeed", 13, 5), new C4091d("GPSTrackRef", 14, 2), new C4091d("GPSTrack", 15, 5), new C4091d("GPSImgDirectionRef", 16, 2), new C4091d("GPSImgDirection", 17, 5), new C4091d("GPSMapDatum", 18, 2), new C4091d("GPSDestLatitudeRef", 19, 2), new C4091d("GPSDestLatitude", 20, 5), new C4091d("GPSDestLongitudeRef", 21, 2), new C4091d("GPSDestLongitude", 22, 5), new C4091d("GPSDestBearingRef", 23, 2), new C4091d("GPSDestBearing", 24, 5), new C4091d("GPSDestDistanceRef", 25, 2), new C4091d("GPSDestDistance", 26, 5), new C4091d("GPSProcessingMethod", 27, 7), new C4091d("GPSAreaInformation", 28, 7), new C4091d("GPSDateStamp", 29, 2), new C4091d("GPSDifferential", 30, 3), new C4091d("GPSHPositioningError", 31, 5)};
        f12310P = dVarArr3;
        C4091d[] dVarArr4 = {new C4091d("InteroperabilityIndex", 1, 2)};
        f12311Q = dVarArr4;
        C4091d[] dVarArr5 = {new C4091d("NewSubfileType", 254, 4), new C4091d("SubfileType", 255, 4), new C4091d("ThumbnailImageWidth", 256, 3, 4), new C4091d("ThumbnailImageLength", 257, 3, 4), new C4091d("BitsPerSample", 258, 3), new C4091d("Compression", 259, 3), new C4091d("PhotometricInterpretation", 262, 3), new C4091d("ImageDescription", 270, 2), new C4091d("Make", 271, 2), new C4091d("Model", 272, 2), new C4091d("StripOffsets", BaseQuickAdapter.HEADER_VIEW, 3, 4), new C4091d("ThumbnailOrientation", 274, 3), new C4091d("SamplesPerPixel", 277, 3), new C4091d("RowsPerStrip", 278, 3, 4), new C4091d("StripByteCounts", 279, 3, 4), new C4091d("XResolution", 282, 5), new C4091d("YResolution", 283, 5), new C4091d("PlanarConfiguration", 284, 3), new C4091d("ResolutionUnit", 296, 3), new C4091d("TransferFunction", 301, 3), new C4091d("Software", 305, 2), new C4091d("DateTime", 306, 2), new C4091d("Artist", 315, 2), new C4091d("WhitePoint", 318, 5), new C4091d("PrimaryChromaticities", 319, 5), new C4091d("SubIFDPointer", 330, 4), new C4091d("JPEGInterchangeFormat", 513, 4), new C4091d("JPEGInterchangeFormatLength", 514, 4), new C4091d("YCbCrCoefficients", 529, 5), new C4091d("YCbCrSubSampling", 530, 3), new C4091d("YCbCrPositioning", 531, 3), new C4091d("ReferenceBlackWhite", 532, 5), new C4091d("Copyright", 33432, 2), new C4091d("ExifIFDPointer", 34665, 4), new C4091d("GPSInfoIFDPointer", 34853, 4), new C4091d("DNGVersion", 50706, 1), new C4091d("DefaultCropSize", 50720, 3, 4)};
        f12312R = dVarArr5;
        C4091d[] dVarArr6 = {new C4091d("ThumbnailImage", 256, 7), new C4091d("CameraSettingsIFDPointer", 8224, 4), new C4091d("ImageProcessingIFDPointer", 8256, 4)};
        f12314T = dVarArr6;
        C4091d[] dVarArr7 = {new C4091d("PreviewImageStart", 257, 4), new C4091d("PreviewImageLength", 258, 4)};
        f12315U = dVarArr7;
        C4091d[] dVarArr8 = {new C4091d("AspectFrame", 4371, 3)};
        f12316V = dVarArr8;
        C4091d[] dVarArr9 = {new C4091d("ColorSpace", 55, 3)};
        f12317W = dVarArr9;
        C4091d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f12318X = dVarArr10;
        f12320Z = new HashMap[dVarArr10.length];
        f12321a0 = new HashMap[dVarArr10.length];
        Charset forName = Charset.forName("US-ASCII");
        f12324d0 = forName;
        f12325e0 = "Exif\u0000\u0000".getBytes(forName);
        f12326f0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f12304J = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C4091d[][] dVarArr11 = f12318X;
            if (i < dVarArr11.length) {
                f12320Z[i] = new HashMap<>();
                f12321a0[i] = new HashMap<>();
                for (C4091d dVar : dVarArr11[i]) {
                    f12320Z[i].put(Integer.valueOf(dVar.f12364a), dVar);
                    f12321a0[i].put(dVar.f12365b, dVar);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = f12323c0;
                C4091d[] dVarArr12 = f12319Y;
                hashMap.put(Integer.valueOf(dVarArr12[0].f12364a), 5);
                hashMap.put(Integer.valueOf(dVarArr12[1].f12364a), 1);
                hashMap.put(Integer.valueOf(dVarArr12[2].f12364a), 2);
                hashMap.put(Integer.valueOf(dVarArr12[3].f12364a), 3);
                hashMap.put(Integer.valueOf(dVarArr12[4].f12364a), 7);
                hashMap.put(Integer.valueOf(dVarArr12[5].f12364a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    public C4087a(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    /* renamed from: A */
    private boolean m18089A(HashMap hashMap) throws IOException {
        C4090c cVar;
        int i;
        C4090c cVar2 = (C4090c) hashMap.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.mo14186k(this.f12343h);
            int[] iArr2 = f12330u;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f12339d == 3 && (cVar = (C4090c) hashMap.get("PhotometricInterpretation")) != null && (((i = cVar.mo14184i(this.f12343h)) == 1 && Arrays.equals(iArr, f12331v)) || (i == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f12327r) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    /* renamed from: B */
    private boolean m18090B(HashMap hashMap) throws IOException {
        C4090c cVar = (C4090c) hashMap.get("ImageLength");
        C4090c cVar2 = (C4090c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.mo14184i(this.f12343h) <= 512 && cVar2.mo14184i(this.f12343h) <= 512;
    }

    /* renamed from: C */
    private boolean m18091C(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f12301G;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = f12302H;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f12301G.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else if (bArr[i] != bArr2[i]) {
                return false;
            } else {
                i++;
            }
        }
    }

    /* renamed from: D */
    private void m18092D(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputstream shouldn't be null");
        int i = 0;
        while (i < f12318X.length) {
            try {
                this.f12341f[i] = new HashMap<>();
                i++;
            } catch (IOException e) {
                boolean z = f12327r;
                if (z) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m18104a();
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                m18104a();
                if (f12327r) {
                    m18094F();
                }
                throw th;
            }
        }
        if (!this.f12340e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f12339d = m18110i(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        C4089b bVar = new C4089b(inputStream);
        if (!this.f12340e) {
            switch (this.f12339d) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    m18114m(bVar);
                    break;
                case 4:
                    m18109h(bVar, 0, 0);
                    break;
                case 7:
                    m18111j(bVar);
                    break;
                case 9:
                    m18113l(bVar);
                    break;
                case 10:
                    m18115n(bVar);
                    break;
                case 12:
                    m18108g(bVar);
                    break;
                case 13:
                    m18112k(bVar);
                    break;
                case 14:
                    m18117p(bVar);
                    break;
            }
        } else {
            m18116o(bVar);
        }
        m18099K(bVar);
        m18104a();
        if (!f12327r) {
            return;
        }
        m18094F();
    }

    /* renamed from: E */
    private void m18093E(C4089b bVar, int i) throws IOException {
        ByteOrder G = m18095G(bVar);
        this.f12343h = G;
        bVar.mo14160E(G);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i2 = this.f12339d;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt < 8 || readInt >= i) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i3 = readInt - 8;
            if (i3 > 0 && bVar.skipBytes(i3) != i3) {
                throw new IOException("Couldn't jump to first Ifd: " + i3);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    /* renamed from: F */
    private void m18094F() {
        for (int i = 0; i < this.f12341f.length; i++) {
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + this.f12341f[i].size());
            for (Map.Entry next : this.f12341f[i].entrySet()) {
                C4090c cVar = (C4090c) next.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) next.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.mo14185j(this.f12343h) + "'");
            }
        }
    }

    /* renamed from: G */
    private ByteOrder m18095G(C4089b bVar) throws IOException {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f12327r) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f12327r) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    /* renamed from: H */
    private void m18096H(byte[] bArr, int i) throws IOException {
        C4089b bVar = new C4089b(bArr);
        m18093E(bVar, bArr.length);
        m18097I(bVar, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0281  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m18097I(p082e.p134m.p135a.C4087a.C4089b r31, int r32) throws java.io.IOException {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            java.util.Set<java.lang.Integer> r3 = r0.f12342g
            int r4 = r1.f12360j
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.f12360j
            r4 = 2
            int r3 = r3 + r4
            int r5 = r1.f12359i
            if (r3 <= r5) goto L_0x001a
            return
        L_0x001a:
            short r3 = r31.readShort()
            boolean r5 = f12327r
            java.lang.String r6 = "ExifInterface"
            if (r5 == 0) goto L_0x0038
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "numberOfDirectoryEntry: "
            r5.append(r7)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r6, r5)
        L_0x0038:
            int r5 = r1.f12360j
            int r7 = r3 * 12
            int r5 = r5 + r7
            int r7 = r1.f12359i
            if (r5 > r7) goto L_0x0413
            if (r3 > 0) goto L_0x0045
            goto L_0x0413
        L_0x0045:
            r5 = 0
            r7 = 0
        L_0x0047:
            r8 = 5
            if (r7 >= r3) goto L_0x0389
            int r13 = r31.readUnsignedShort()
            int r14 = r31.readUnsignedShort()
            int r15 = r31.readInt()
            int r9 = r31.mo14163d()
            long r9 = (long) r9
            r18 = 4
            long r9 = r9 + r18
            java.util.HashMap<java.lang.Integer, e.m.a.a$d>[] r20 = f12320Z
            r12 = r20[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            java.lang.Object r4 = r12.get(r4)
            e.m.a.a$d r4 = (p082e.p134m.p135a.C4087a.C4091d) r4
            boolean r12 = f12327r
            r11 = 3
            if (r12 == 0) goto L_0x00a3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r23 = java.lang.Integer.valueOf(r32)
            r8[r5] = r23
            java.lang.Integer r23 = java.lang.Integer.valueOf(r13)
            r20 = 1
            r8[r20] = r23
            if (r4 == 0) goto L_0x0087
            java.lang.String r5 = r4.f12365b
            goto L_0x0088
        L_0x0087:
            r5 = 0
        L_0x0088:
            r22 = 2
            r8[r22] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            r8[r11] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r21 = 4
            r8[r21] = r5
            java.lang.String r5 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r5 = java.lang.String.format(r5, r8)
            android.util.Log.d(r6, r5)
        L_0x00a3:
            r5 = 7
            if (r4 != 0) goto L_0x00c1
            if (r12 == 0) goto L_0x00bc
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "Skip the tag entry since tag number is not defined: "
            r8.append(r11)
            r8.append(r13)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r6, r8)
        L_0x00bc:
            r11 = r6
            r25 = r7
            goto L_0x0141
        L_0x00c1:
            if (r14 <= 0) goto L_0x0128
            int[] r8 = f12306L
            int r11 = r8.length
            if (r14 < r11) goto L_0x00c9
            goto L_0x0128
        L_0x00c9:
            boolean r11 = r4.mo14188a(r14)
            if (r11 != 0) goto L_0x00f4
            if (r12 == 0) goto L_0x00bc
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "Skip the tag entry since data format ("
            r8.append(r11)
            java.lang.String[] r11 = f12305K
            r11 = r11[r14]
            r8.append(r11)
            java.lang.String r11 = ") is unexpected for tag: "
            r8.append(r11)
            java.lang.String r11 = r4.f12365b
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r6, r8)
            goto L_0x00bc
        L_0x00f4:
            if (r14 != r5) goto L_0x00f8
            int r14 = r4.f12366c
        L_0x00f8:
            r11 = r6
            long r5 = (long) r15
            r8 = r8[r14]
            r25 = r7
            long r7 = (long) r8
            long r5 = r5 * r7
            r7 = 0
            int r26 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r26 < 0) goto L_0x0111
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r26 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r26 <= 0) goto L_0x010f
            goto L_0x0111
        L_0x010f:
            r7 = 1
            goto L_0x0144
        L_0x0111:
            if (r12 == 0) goto L_0x0143
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Skip the tag entry since the number of components is invalid: "
            r7.append(r8)
            r7.append(r15)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r11, r7)
            goto L_0x0143
        L_0x0128:
            r11 = r6
            r25 = r7
            if (r12 == 0) goto L_0x0141
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Skip the tag entry since data format is invalid: "
            r5.append(r6)
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r11, r5)
        L_0x0141:
            r5 = 0
        L_0x0143:
            r7 = 0
        L_0x0144:
            if (r7 != 0) goto L_0x014e
            r1.mo14182x(r9)
            r26 = r3
        L_0x014b:
            r13 = 2
            goto L_0x037d
        L_0x014e:
            java.lang.String r7 = "Compression"
            int r8 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r8 <= 0) goto L_0x0216
            int r8 = r31.readInt()
            r26 = r3
            if (r12 == 0) goto L_0x0173
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r18 = r14
            java.lang.String r14 = "seek to data offset: "
            r3.append(r14)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r11, r3)
            goto L_0x0175
        L_0x0173:
            r18 = r14
        L_0x0175:
            int r3 = r0.f12339d
            r14 = 7
            if (r3 != r14) goto L_0x01d5
            java.lang.String r3 = r4.f12365b
            java.lang.String r14 = "MakerNote"
            boolean r3 = r14.equals(r3)
            if (r3 == 0) goto L_0x0187
            r0.f12349n = r8
            goto L_0x01d0
        L_0x0187:
            r3 = 6
            if (r2 != r3) goto L_0x01d0
            java.lang.String r14 = r4.f12365b
            java.lang.String r3 = "ThumbnailImage"
            boolean r3 = r3.equals(r14)
            if (r3 == 0) goto L_0x01d0
            r0.f12350o = r8
            r0.f12351p = r15
            java.nio.ByteOrder r3 = r0.f12343h
            r14 = 6
            e.m.a.a$c r3 = p082e.p134m.p135a.C4087a.C4090c.m18140f(r14, r3)
            int r14 = r0.f12350o
            r19 = r15
            long r14 = (long) r14
            java.nio.ByteOrder r2 = r0.f12343h
            e.m.a.a$c r2 = p082e.p134m.p135a.C4087a.C4090c.m18136b(r14, r2)
            int r14 = r0.f12351p
            long r14 = (long) r14
            r24 = r13
            java.nio.ByteOrder r13 = r0.f12343h
            e.m.a.a$c r13 = p082e.p134m.p135a.C4087a.C4090c.m18136b(r14, r13)
            java.util.HashMap<java.lang.String, e.m.a.a$c>[] r14 = r0.f12341f
            r15 = 4
            r14 = r14[r15]
            r14.put(r7, r3)
            java.util.HashMap<java.lang.String, e.m.a.a$c>[] r3 = r0.f12341f
            r3 = r3[r15]
            java.lang.String r14 = "JPEGInterchangeFormat"
            r3.put(r14, r2)
            java.util.HashMap<java.lang.String, e.m.a.a$c>[] r2 = r0.f12341f
            r2 = r2[r15]
            java.lang.String r3 = "JPEGInterchangeFormatLength"
            r2.put(r3, r13)
            goto L_0x01e9
        L_0x01d0:
            r24 = r13
            r19 = r15
            goto L_0x01e9
        L_0x01d5:
            r24 = r13
            r19 = r15
            r2 = 10
            if (r3 != r2) goto L_0x01e9
            java.lang.String r2 = r4.f12365b
            java.lang.String r3 = "JpgFromRaw"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x01e9
            r0.f12352q = r8
        L_0x01e9:
            long r2 = (long) r8
            long r13 = r2 + r5
            int r15 = r1.f12359i
            r27 = r4
            r28 = r5
            long r4 = (long) r15
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x01fb
            r1.mo14182x(r2)
            goto L_0x0222
        L_0x01fb:
            if (r12 == 0) goto L_0x0211
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip the tag entry since data offset is invalid: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r11, r2)
        L_0x0211:
            r1.mo14182x(r9)
            goto L_0x014b
        L_0x0216:
            r26 = r3
            r27 = r4
            r28 = r5
            r24 = r13
            r18 = r14
            r19 = r15
        L_0x0222:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = f12323c0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r24)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r12 == 0) goto L_0x024f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "nextIfdType: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = " byteCount: "
            r3.append(r4)
            r5 = r28
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r11, r3)
            goto L_0x0251
        L_0x024f:
            r5 = r28
        L_0x0251:
            r3 = 8
            if (r2 == 0) goto L_0x02fe
            r4 = -1
            r14 = r18
            r6 = 3
            if (r14 == r6) goto L_0x0279
            r6 = 4
            if (r14 == r6) goto L_0x0274
            if (r14 == r3) goto L_0x026f
            r3 = 9
            if (r14 == r3) goto L_0x026a
            r3 = 13
            if (r14 == r3) goto L_0x026a
            goto L_0x027e
        L_0x026a:
            int r3 = r31.readInt()
            goto L_0x027d
        L_0x026f:
            short r3 = r31.readShort()
            goto L_0x027d
        L_0x0274:
            long r4 = r31.mo14164p()
            goto L_0x027e
        L_0x0279:
            int r3 = r31.readUnsignedShort()
        L_0x027d:
            long r4 = (long) r3
        L_0x027e:
            r13 = 2
            if (r12 == 0) goto L_0x029a
            java.lang.Object[] r3 = new java.lang.Object[r13]
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            r7 = 0
            r3[r7] = r6
            r8 = r27
            java.lang.String r6 = r8.f12365b
            r7 = 1
            r3[r7] = r6
            java.lang.String r6 = "Offset: %d, tagName: %s"
            java.lang.String r3 = java.lang.String.format(r6, r3)
            android.util.Log.d(r11, r3)
        L_0x029a:
            r6 = 0
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x02e3
            int r3 = r1.f12359i
            long r6 = (long) r3
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x02e3
            java.util.Set<java.lang.Integer> r3 = r0.f12342g
            int r6 = (int) r4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r3 = r3.contains(r6)
            if (r3 != 0) goto L_0x02bf
            r1.mo14182x(r4)
            int r2 = r2.intValue()
            r0.m18097I(r1, r2)
            goto L_0x02f9
        L_0x02bf:
            if (r12 == 0) goto L_0x02f9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Skip jump into the IFD since it has already been read: IfdType "
            r3.append(r6)
            r3.append(r2)
            java.lang.String r2 = " (at "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = ")"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.util.Log.d(r11, r2)
            goto L_0x02f9
        L_0x02e3:
            if (r12 == 0) goto L_0x02f9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r11, r2)
        L_0x02f9:
            r1.mo14182x(r9)
            goto L_0x037d
        L_0x02fe:
            r14 = r18
            r8 = r27
            r13 = 2
            int r2 = r31.mo14163d()
            int r4 = r0.f12348m
            int r2 = r2 + r4
            int r4 = (int) r5
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            e.m.a.a$c r5 = new e.m.a.a$c
            r12 = r4
            long r3 = (long) r2
            r2 = r19
            r15 = r5
            r16 = r14
            r17 = r2
            r18 = r3
            r20 = r12
            r15.<init>(r16, r17, r18, r20)
            java.util.HashMap<java.lang.String, e.m.a.a$c>[] r2 = r0.f12341f
            r2 = r2[r32]
            java.lang.String r3 = r8.f12365b
            r2.put(r3, r5)
            java.lang.String r2 = r8.f12365b
            java.lang.String r3 = "DNGVersion"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0338
            r2 = 3
            r0.f12339d = r2
        L_0x0338:
            java.lang.String r2 = r8.f12365b
            java.lang.String r3 = "Make"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x034c
            java.lang.String r2 = r8.f12365b
            java.lang.String r3 = "Model"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x035a
        L_0x034c:
            java.nio.ByteOrder r2 = r0.f12343h
            java.lang.String r2 = r5.mo14185j(r2)
            java.lang.String r3 = "PENTAX"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x036d
        L_0x035a:
            java.lang.String r2 = r8.f12365b
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0371
            java.nio.ByteOrder r2 = r0.f12343h
            int r2 = r5.mo14184i(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L_0x0371
        L_0x036d:
            r2 = 8
            r0.f12339d = r2
        L_0x0371:
            int r2 = r31.mo14163d()
            long r2 = (long) r2
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x037d
            r1.mo14182x(r9)
        L_0x037d:
            int r7 = r25 + 1
            short r7 = (short) r7
            r2 = r32
            r6 = r11
            r3 = r26
            r4 = 2
            r5 = 0
            goto L_0x0047
        L_0x0389:
            r11 = r6
            int r2 = r31.mo14163d()
            r3 = 4
            int r2 = r2 + r3
            int r3 = r1.f12359i
            if (r2 > r3) goto L_0x0413
            int r2 = r31.readInt()
            boolean r3 = f12327r
            if (r3 == 0) goto L_0x03af
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "nextIfdOffset: %d"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            android.util.Log.d(r11, r4)
        L_0x03af:
            long r4 = (long) r2
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x03fd
            int r6 = r1.f12359i
            if (r2 >= r6) goto L_0x03fd
            java.util.Set<java.lang.Integer> r6 = r0.f12342g
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x03e6
            r1.mo14182x(r4)
            java.util.HashMap<java.lang.String, e.m.a.a$c>[] r2 = r0.f12341f
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x03d8
            r0.m18097I(r1, r3)
            goto L_0x0413
        L_0x03d8:
            java.util.HashMap<java.lang.String, e.m.a.a$c>[] r2 = r0.f12341f
            r2 = r2[r8]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0413
            r0.m18097I(r1, r8)
            goto L_0x0413
        L_0x03e6:
            if (r3 == 0) goto L_0x0413
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r11, r1)
            goto L_0x0413
        L_0x03fd:
            if (r3 == 0) goto L_0x0413
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r11, r1)
        L_0x0413:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p134m.p135a.C4087a.m18097I(e.m.a.a$b, int):void");
    }

    /* renamed from: J */
    private void m18098J(C4089b bVar, int i) throws IOException {
        C4090c cVar;
        C4090c cVar2 = this.f12341f[i].get("ImageLength");
        C4090c cVar3 = this.f12341f[i].get("ImageWidth");
        if ((cVar2 == null || cVar3 == null) && (cVar = this.f12341f[i].get("JPEGInterchangeFormat")) != null) {
            m18109h(bVar, cVar.mo14184i(this.f12343h), i);
        }
    }

    /* renamed from: K */
    private void m18099K(C4089b bVar) throws IOException {
        HashMap<String, C4090c> hashMap = this.f12341f[4];
        C4090c cVar = hashMap.get("Compression");
        if (cVar != null) {
            int i = cVar.mo14184i(this.f12343h);
            this.f12347l = i;
            if (i != 1) {
                if (i == 6) {
                    m18118q(bVar, hashMap);
                    return;
                } else if (i != 7) {
                    return;
                }
            }
            if (m18089A(hashMap)) {
                m18119r(bVar, hashMap);
                return;
            }
            return;
        }
        this.f12347l = 6;
        m18118q(bVar, hashMap);
    }

    /* renamed from: L */
    private static boolean m18100L(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: M */
    private void m18101M(int i, int i2) throws IOException {
        if (!this.f12341f[i].isEmpty() && !this.f12341f[i2].isEmpty()) {
            C4090c cVar = this.f12341f[i].get("ImageLength");
            C4090c cVar2 = this.f12341f[i].get("ImageWidth");
            C4090c cVar3 = this.f12341f[i2].get("ImageLength");
            C4090c cVar4 = this.f12341f[i2].get("ImageWidth");
            if (cVar == null || cVar2 == null) {
                if (f12327r) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (cVar3 != null && cVar4 != null) {
                int i3 = cVar.mo14184i(this.f12343h);
                int i4 = cVar2.mo14184i(this.f12343h);
                int i5 = cVar3.mo14184i(this.f12343h);
                int i6 = cVar4.mo14184i(this.f12343h);
                if (i3 < i5 && i4 < i6) {
                    HashMap<String, C4090c>[] hashMapArr = this.f12341f;
                    HashMap<String, C4090c> hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            } else if (f12327r) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (f12327r) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    /* renamed from: N */
    private void m18102N(C4089b bVar, int i) throws IOException {
        C4090c cVar;
        C4090c cVar2;
        C4090c cVar3 = this.f12341f[i].get("DefaultCropSize");
        C4090c cVar4 = this.f12341f[i].get("SensorTopBorder");
        C4090c cVar5 = this.f12341f[i].get("SensorLeftBorder");
        C4090c cVar6 = this.f12341f[i].get("SensorBottomBorder");
        C4090c cVar7 = this.f12341f[i].get("SensorRightBorder");
        if (cVar3 != null) {
            if (cVar3.f12361a == 5) {
                C4092e[] eVarArr = (C4092e[]) cVar3.mo14186k(this.f12343h);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                cVar2 = C4090c.m18138d(eVarArr[0], this.f12343h);
                cVar = C4090c.m18138d(eVarArr[1], this.f12343h);
            } else {
                int[] iArr = (int[]) cVar3.mo14186k(this.f12343h);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                cVar2 = C4090c.m18140f(iArr[0], this.f12343h);
                cVar = C4090c.m18140f(iArr[1], this.f12343h);
            }
            this.f12341f[i].put("ImageWidth", cVar2);
            this.f12341f[i].put("ImageLength", cVar);
        } else if (cVar4 == null || cVar5 == null || cVar6 == null || cVar7 == null) {
            m18098J(bVar, i);
        } else {
            int i2 = cVar4.mo14184i(this.f12343h);
            int i3 = cVar6.mo14184i(this.f12343h);
            int i4 = cVar7.mo14184i(this.f12343h);
            int i5 = cVar5.mo14184i(this.f12343h);
            if (i3 > i2 && i4 > i5) {
                C4090c f = C4090c.m18140f(i3 - i2, this.f12343h);
                C4090c f2 = C4090c.m18140f(i4 - i5, this.f12343h);
                this.f12341f[i].put("ImageLength", f);
                this.f12341f[i].put("ImageWidth", f2);
            }
        }
    }

    /* renamed from: O */
    private void m18103O() throws IOException {
        m18101M(0, 5);
        m18101M(0, 4);
        m18101M(5, 4);
        C4090c cVar = this.f12341f[1].get("PixelXDimension");
        C4090c cVar2 = this.f12341f[1].get("PixelYDimension");
        if (!(cVar == null || cVar2 == null)) {
            this.f12341f[0].put("ImageWidth", cVar);
            this.f12341f[0].put("ImageLength", cVar2);
        }
        if (this.f12341f[4].isEmpty() && m18090B(this.f12341f[5])) {
            HashMap<String, C4090c>[] hashMapArr = this.f12341f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m18090B(this.f12341f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    /* renamed from: a */
    private void m18104a() {
        String d = mo14155d("DateTimeOriginal");
        if (d != null && mo14155d("DateTime") == null) {
            this.f12341f[0].put("DateTime", C4090c.m18135a(d));
        }
        if (mo14155d("ImageWidth") == null) {
            this.f12341f[0].put("ImageWidth", C4090c.m18136b(0, this.f12343h));
        }
        if (mo14155d("ImageLength") == null) {
            this.f12341f[0].put("ImageLength", C4090c.m18136b(0, this.f12343h));
        }
        if (mo14155d("Orientation") == null) {
            this.f12341f[0].put("Orientation", C4090c.m18136b(0, this.f12343h));
        }
        if (mo14155d("LightSource") == null) {
            this.f12341f[1].put("LightSource", C4090c.m18136b(0, this.f12343h));
        }
    }

    /* renamed from: b */
    private static String m18105b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return sb.toString();
    }

    /* renamed from: c */
    private static long[] m18106c(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    /* renamed from: f */
    private C4090c m18107f(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if ("ISOSpeedRatings".equals(str)) {
            if (f12327r) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f12318X.length; i++) {
            C4090c cVar = this.f12341f[i].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    private void m18108g(C4089b bVar) throws IOException {
        String str;
        String str2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                mediaMetadataRetriever.setDataSource(new C4088a(this, bVar));
            } else {
                FileDescriptor fileDescriptor = this.f12337b;
                if (fileDescriptor != null) {
                    mediaMetadataRetriever.setDataSource(fileDescriptor);
                } else {
                    String str3 = this.f12336a;
                    if (str3 != null) {
                        mediaMetadataRetriever.setDataSource(str3);
                    } else {
                        mediaMetadataRetriever.release();
                        return;
                    }
                }
            }
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            String str4 = null;
            if ("yes".equals(extractMetadata3)) {
                str4 = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str4 = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str2 = null;
                str = null;
            }
            if (str4 != null) {
                this.f12341f[0].put("ImageWidth", C4090c.m18140f(Integer.parseInt(str4), this.f12343h));
            }
            if (str2 != null) {
                this.f12341f[0].put("ImageLength", C4090c.m18140f(Integer.parseInt(str2), this.f12343h));
            }
            if (str != null) {
                int i = 1;
                int parseInt = Integer.parseInt(str);
                if (parseInt == 90) {
                    i = 6;
                } else if (parseInt == 180) {
                    i = 3;
                } else if (parseInt == 270) {
                    i = 8;
                }
                this.f12341f[0].put("Orientation", C4090c.m18140f(i, this.f12343h));
            }
            if (!(extractMetadata == null || extractMetadata2 == null)) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.mo14182x((long) parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i2 = parseInt2 + 6;
                        int i3 = parseInt3 - 6;
                        if (Arrays.equals(bArr, f12325e0)) {
                            byte[] bArr2 = new byte[i3];
                            if (bVar.read(bArr2) == i3) {
                                this.f12348m = i2;
                                m18096H(bArr2, 0);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            if (f12327r) {
                Log.d("ExifInterface", "Heif meta: " + str4 + "x" + str2 + ", rotation " + str);
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0186 A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m18109h(p082e.p134m.p135a.C4087a.C4089b r20, int r21, int r22) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            boolean r4 = f12327r
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L_0x0022
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "getJpegAttributes starting with: "
            r4.append(r6)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x0022:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            r1.mo14160E(r4)
            long r6 = (long) r2
            r1.mo14182x(r6)
            byte r4 = r20.readByte()
            java.lang.String r6 = "Invalid marker: "
            r7 = -1
            if (r4 != r7) goto L_0x01d0
            r8 = 1
            int r2 = r2 + r8
            byte r9 = r20.readByte()
            r10 = -40
            if (r9 != r10) goto L_0x01b5
            int r2 = r2 + r8
        L_0x003f:
            byte r4 = r20.readByte()
            if (r4 != r7) goto L_0x0198
            int r2 = r2 + r8
            byte r4 = r20.readByte()
            boolean r6 = f12327r
            if (r6 == 0) goto L_0x0068
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Found JPEG segment indicator: "
            r9.append(r10)
            r10 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r10 = java.lang.Integer.toHexString(r10)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r5, r9)
        L_0x0068:
            int r2 = r2 + r8
            r9 = -39
            if (r4 == r9) goto L_0x0192
            r9 = -38
            if (r4 != r9) goto L_0x0073
            goto L_0x0192
        L_0x0073:
            int r9 = r20.readUnsignedShort()
            int r9 = r9 + -2
            int r2 = r2 + 2
            if (r6 == 0) goto L_0x00a6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "JPEG segment: "
            r6.append(r10)
            r10 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r10 = java.lang.Integer.toHexString(r10)
            r6.append(r10)
            java.lang.String r10 = " (length: "
            r6.append(r10)
            int r10 = r9 + 2
            r6.append(r10)
            java.lang.String r10 = ")"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x00a6:
            java.lang.String r6 = "Invalid length"
            if (r9 < 0) goto L_0x018c
            r10 = -31
            r11 = 0
            if (r4 == r10) goto L_0x0125
            r10 = -2
            if (r4 == r10) goto L_0x00fa
            switch(r4) {
                case -64: goto L_0x00c0;
                case -63: goto L_0x00c0;
                case -62: goto L_0x00c0;
                case -61: goto L_0x00c0;
                default: goto L_0x00b5;
            }
        L_0x00b5:
            switch(r4) {
                case -59: goto L_0x00c0;
                case -58: goto L_0x00c0;
                case -57: goto L_0x00c0;
                default: goto L_0x00b8;
            }
        L_0x00b8:
            switch(r4) {
                case -55: goto L_0x00c0;
                case -54: goto L_0x00c0;
                case -53: goto L_0x00c0;
                default: goto L_0x00bb;
            }
        L_0x00bb:
            switch(r4) {
                case -51: goto L_0x00c0;
                case -50: goto L_0x00c0;
                case -49: goto L_0x00c0;
                default: goto L_0x00be;
            }
        L_0x00be:
            goto L_0x0171
        L_0x00c0:
            int r4 = r1.skipBytes(r8)
            if (r4 != r8) goto L_0x00f2
            java.util.HashMap<java.lang.String, e.m.a.a$c>[] r4 = r0.f12341f
            r4 = r4[r3]
            int r10 = r20.readUnsignedShort()
            long r10 = (long) r10
            java.nio.ByteOrder r12 = r0.f12343h
            e.m.a.a$c r10 = p082e.p134m.p135a.C4087a.C4090c.m18136b(r10, r12)
            java.lang.String r11 = "ImageLength"
            r4.put(r11, r10)
            java.util.HashMap<java.lang.String, e.m.a.a$c>[] r4 = r0.f12341f
            r4 = r4[r3]
            int r10 = r20.readUnsignedShort()
            long r10 = (long) r10
            java.nio.ByteOrder r12 = r0.f12343h
            e.m.a.a$c r10 = p082e.p134m.p135a.C4087a.C4090c.m18136b(r10, r12)
            java.lang.String r11 = "ImageWidth"
            r4.put(r11, r10)
            int r9 = r9 + -5
            goto L_0x0171
        L_0x00f2:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid SOFx"
            r1.<init>(r2)
            throw r1
        L_0x00fa:
            byte[] r4 = new byte[r9]
            int r10 = r1.read(r4)
            if (r10 != r9) goto L_0x011d
            java.lang.String r9 = "UserComment"
            java.lang.String r10 = r0.mo14155d(r9)
            if (r10 != 0) goto L_0x0170
            java.util.HashMap<java.lang.String, e.m.a.a$c>[] r10 = r0.f12341f
            r10 = r10[r8]
            java.lang.String r12 = new java.lang.String
            java.nio.charset.Charset r13 = f12324d0
            r12.<init>(r4, r13)
            e.m.a.a$c r4 = p082e.p134m.p135a.C4087a.C4090c.m18135a(r12)
            r10.put(r9, r4)
            goto L_0x0170
        L_0x011d:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x0125:
            byte[] r4 = new byte[r9]
            r1.readFully(r4)
            int r10 = r2 + r9
            byte[] r12 = f12325e0
            boolean r13 = m18100L(r4, r12)
            if (r13 == 0) goto L_0x0141
            int r13 = r12.length
            int r2 = r2 + r13
            int r12 = r12.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r12, r9)
            r0.f12348m = r2
            r0.m18096H(r4, r3)
            goto L_0x016f
        L_0x0141:
            byte[] r12 = f12326f0
            boolean r13 = m18100L(r4, r12)
            if (r13 == 0) goto L_0x016f
            int r13 = r12.length
            int r2 = r2 + r13
            int r12 = r12.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r12, r9)
            java.lang.String r9 = "Xmp"
            java.lang.String r12 = r0.mo14155d(r9)
            if (r12 != 0) goto L_0x016f
            java.util.HashMap<java.lang.String, e.m.a.a$c>[] r12 = r0.f12341f
            r12 = r12[r11]
            e.m.a.a$c r15 = new e.m.a.a$c
            r14 = 1
            int r13 = r4.length
            long r7 = (long) r2
            r2 = r13
            r13 = r15
            r11 = r15
            r15 = r2
            r16 = r7
            r18 = r4
            r13.<init>(r14, r15, r16, r18)
            r12.put(r9, r11)
        L_0x016f:
            r2 = r10
        L_0x0170:
            r9 = 0
        L_0x0171:
            if (r9 < 0) goto L_0x0186
            int r4 = r1.skipBytes(r9)
            if (r4 != r9) goto L_0x017e
            int r2 = r2 + r9
            r7 = -1
            r8 = 1
            goto L_0x003f
        L_0x017e:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid JPEG segment"
            r1.<init>(r2)
            throw r1
        L_0x0186:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r6)
            throw r1
        L_0x018c:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r6)
            throw r1
        L_0x0192:
            java.nio.ByteOrder r2 = r0.f12343h
            r1.mo14160E(r2)
            return
        L_0x0198:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid marker:"
            r2.append(r3)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01b5:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01d0:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p134m.p135a.C4087a.m18109h(e.m.a.a$b, int, int):void");
    }

    /* renamed from: i */
    private int m18110i(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m18122u(bArr)) {
            return 4;
        }
        if (m18125x(bArr)) {
            return 9;
        }
        if (m18121t(bArr)) {
            return 12;
        }
        if (m18123v(bArr)) {
            return 7;
        }
        if (m18126y(bArr)) {
            return 10;
        }
        if (m18124w(bArr)) {
            return 13;
        }
        return m18091C(bArr) ? 14 : 0;
    }

    /* renamed from: j */
    private void m18111j(C4089b bVar) throws IOException {
        m18114m(bVar);
        C4090c cVar = this.f12341f[1].get("MakerNote");
        if (cVar != null) {
            C4089b bVar2 = new C4089b(cVar.f12363c);
            bVar2.mo14160E(this.f12343h);
            byte[] bArr = f12295A;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.mo14182x(0);
            byte[] bArr3 = f12296B;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.mo14182x(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.mo14182x(12);
            }
            m18097I(bVar2, 6);
            C4090c cVar2 = this.f12341f[7].get("PreviewImageStart");
            C4090c cVar3 = this.f12341f[7].get("PreviewImageLength");
            if (!(cVar2 == null || cVar3 == null)) {
                this.f12341f[5].put("JPEGInterchangeFormat", cVar2);
                this.f12341f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            C4090c cVar4 = this.f12341f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.mo14186k(this.f12343h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                } else if (iArr[2] > iArr[0] && iArr[3] > iArr[1]) {
                    int i = (iArr[2] - iArr[0]) + 1;
                    int i2 = (iArr[3] - iArr[1]) + 1;
                    if (i < i2) {
                        int i3 = i + i2;
                        i2 = i3 - i2;
                        i = i3 - i2;
                    }
                    C4090c f = C4090c.m18140f(i, this.f12343h);
                    C4090c f2 = C4090c.m18140f(i2, this.f12343h);
                    this.f12341f[0].put("ImageWidth", f);
                    this.f12341f[0].put("ImageLength", f2);
                }
            }
        }
    }

    /* renamed from: k */
    private void m18112k(C4089b bVar) throws IOException {
        if (f12327r) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.mo14160E(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f12297C;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i2 = i + 4;
                    if (i2 == 16) {
                        if (!Arrays.equals(bArr2, f12299E)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, f12300F)) {
                        if (Arrays.equals(bArr2, f12298D)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f12348m = i2;
                                    m18096H(bArr3, 0);
                                    m18103O();
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + m18105b(bArr2));
                        }
                        int i3 = readInt + 4;
                        bVar.skipBytes(i3);
                        length = i2 + i3;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: l */
    private void m18113l(C4089b bVar) throws IOException {
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        m18109h(bVar, i, 5);
        bVar.mo14182x((long) i2);
        bVar.mo14160E(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (f12327r) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f12313S.f12364a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                C4090c f = C4090c.m18140f(readShort, this.f12343h);
                C4090c f2 = C4090c.m18140f(readShort2, this.f12343h);
                this.f12341f[0].put("ImageLength", f);
                this.f12341f[0].put("ImageWidth", f2);
                if (f12327r) {
                    Log.d("ExifInterface", "Updated to length: " + readShort + ", width: " + readShort2);
                    return;
                }
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    /* renamed from: m */
    private void m18114m(C4089b bVar) throws IOException {
        C4090c cVar;
        m18093E(bVar, bVar.available());
        m18097I(bVar, 0);
        m18102N(bVar, 0);
        m18102N(bVar, 5);
        m18102N(bVar, 4);
        m18103O();
        if (this.f12339d == 8 && (cVar = this.f12341f[1].get("MakerNote")) != null) {
            C4089b bVar2 = new C4089b(cVar.f12363c);
            bVar2.mo14160E(this.f12343h);
            bVar2.mo14182x(6);
            m18097I(bVar2, 9);
            C4090c cVar2 = this.f12341f[9].get("ColorSpace");
            if (cVar2 != null) {
                this.f12341f[1].put("ColorSpace", cVar2);
            }
        }
    }

    /* renamed from: n */
    private void m18115n(C4089b bVar) throws IOException {
        m18114m(bVar);
        if (this.f12341f[0].get("JpgFromRaw") != null) {
            m18109h(bVar, this.f12352q, 5);
        }
        C4090c cVar = this.f12341f[0].get("ISO");
        C4090c cVar2 = this.f12341f[1].get("PhotographicSensitivity");
        if (cVar != null && cVar2 == null) {
            this.f12341f[1].put("PhotographicSensitivity", cVar);
        }
    }

    /* renamed from: o */
    private void m18116o(C4089b bVar) throws IOException {
        byte[] bArr = f12325e0;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.f12348m = bArr.length;
        m18096H(bArr2, 0);
    }

    /* renamed from: p */
    private void m18117p(C4089b bVar) throws IOException {
        if (f12327r) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.mo14160E(ByteOrder.LITTLE_ENDIAN);
        bVar.skipBytes(f12301G.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(f12302H.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    int readInt2 = bVar.readInt();
                    int i = skipBytes + 4 + 4;
                    if (Arrays.equals(f12303I, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (bVar.read(bArr2) == readInt2) {
                            this.f12348m = i;
                            m18096H(bArr2, 0);
                            this.f12348m = i;
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + m18105b(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i2 = i + readInt2;
                    if (i2 != readInt) {
                        if (i2 <= readInt) {
                            int skipBytes2 = bVar.skipBytes(readInt2);
                            if (skipBytes2 == readInt2) {
                                skipBytes = i + skipBytes2;
                            } else {
                                throw new IOException("Encountered WebP file with invalid chunk size");
                            }
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: q */
    private void m18118q(C4089b bVar, HashMap hashMap) throws IOException {
        C4090c cVar = (C4090c) hashMap.get("JPEGInterchangeFormat");
        C4090c cVar2 = (C4090c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int i = cVar.mo14184i(this.f12343h);
            int i2 = cVar2.mo14184i(this.f12343h);
            if (this.f12339d == 7) {
                i += this.f12349n;
            }
            int min = Math.min(i2, bVar.mo14162c() - i);
            if (i > 0 && min > 0) {
                int i3 = this.f12348m + i;
                this.f12345j = i3;
                this.f12346k = min;
                if (this.f12336a == null && this.f12338c == null && this.f12337b == null) {
                    bVar.mo14182x((long) i3);
                    bVar.readFully(new byte[min]);
                }
            }
            if (f12327r) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i + ", length: " + min);
            }
        }
    }

    /* renamed from: r */
    private void m18119r(C4089b bVar, HashMap hashMap) throws IOException {
        C4089b bVar2 = bVar;
        HashMap hashMap2 = hashMap;
        C4090c cVar = (C4090c) hashMap2.get("StripOffsets");
        C4090c cVar2 = (C4090c) hashMap2.get("StripByteCounts");
        if (cVar != null && cVar2 != null) {
            long[] c = m18106c(cVar.mo14186k(this.f12343h));
            long[] c2 = m18106c(cVar2.mo14186k(this.f12343h));
            if (c == null || c.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            } else if (c2 == null || c2.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            } else if (c.length != c2.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            } else {
                long j = 0;
                for (long j2 : c2) {
                    j += j2;
                }
                int i = (int) j;
                byte[] bArr = new byte[i];
                this.f12344i = true;
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < c.length; i4++) {
                    int i5 = (int) c[i4];
                    int i6 = (int) c2[i4];
                    if (i4 < c.length - 1 && ((long) (i5 + i6)) != c[i4 + 1]) {
                        this.f12344i = false;
                    }
                    int i7 = i5 - i2;
                    if (i7 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                    }
                    bVar2.mo14182x((long) i7);
                    int i8 = i2 + i7;
                    byte[] bArr2 = new byte[i6];
                    bVar2.read(bArr2);
                    i2 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i3, i6);
                    i3 += i6;
                }
                if (this.f12344i) {
                    this.f12345j = ((int) c[0]) + this.f12348m;
                    this.f12346k = i;
                }
            }
        }
    }

    /* renamed from: s */
    private static boolean m18120s(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f12325e0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = f12325e0;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr2[i] != bArr3[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0092 A[Catch:{ all -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a1  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m18121t(byte[] r15) throws java.io.IOException {
        /*
            r14 = this;
            r0 = 0
            r1 = 0
            e.m.a.a$b r2 = new e.m.a.a$b     // Catch:{ Exception -> 0x008d }
            r2.<init>((byte[]) r15)     // Catch:{ Exception -> 0x008d }
            int r1 = r2.readInt()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = (long) r1     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r1 = 4
            byte[] r5 = new byte[r1]     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r2.read(r5)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            byte[] r6 = f12333x     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r5 != 0) goto L_0x001e
            r2.close()
            return r0
        L_0x001e:
            r5 = 16
            r7 = 8
            r9 = 1
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0034
            long r3 = r2.readLong()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 >= 0) goto L_0x0035
            r2.close()
            return r0
        L_0x0034:
            r5 = r7
        L_0x0035:
            int r11 = r15.length     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r11 = (long) r11     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            int r13 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x003d
            int r15 = r15.length     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = (long) r15
        L_0x003d:
            long r3 = r3 - r5
            int r15 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r15 >= 0) goto L_0x0046
            r2.close()
            return r0
        L_0x0046:
            byte[] r15 = new byte[r1]     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r5 = 0
            r7 = 0
            r8 = 0
        L_0x004c:
            r11 = 4
            long r11 = r3 / r11
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0081
            int r11 = r2.read(r15)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r11 == r1) goto L_0x005e
            r2.close()
            return r0
        L_0x005e:
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0063
            goto L_0x007f
        L_0x0063:
            byte[] r11 = f12334y     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r12 = 1
            if (r11 == 0) goto L_0x006e
            r7 = 1
            goto L_0x0077
        L_0x006e:
            byte[] r11 = f12335z     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r11 == 0) goto L_0x0077
            r8 = 1
        L_0x0077:
            if (r7 == 0) goto L_0x007f
            if (r8 == 0) goto L_0x007f
            r2.close()
            return r12
        L_0x007f:
            long r5 = r5 + r9
            goto L_0x004c
        L_0x0081:
            r2.close()
            goto L_0x009e
        L_0x0085:
            r15 = move-exception
            r1 = r2
            goto L_0x009f
        L_0x0088:
            r15 = move-exception
            r1 = r2
            goto L_0x008e
        L_0x008b:
            r15 = move-exception
            goto L_0x009f
        L_0x008d:
            r15 = move-exception
        L_0x008e:
            boolean r2 = f12327r     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x0099
            java.lang.String r2 = "ExifInterface"
            java.lang.String r3 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r3, r15)     // Catch:{ all -> 0x008b }
        L_0x0099:
            if (r1 == 0) goto L_0x009e
            r1.close()
        L_0x009e:
            return r0
        L_0x009f:
            if (r1 == 0) goto L_0x00a4
            r1.close()
        L_0x00a4:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p134m.p135a.C4087a.m18121t(byte[]):boolean");
    }

    /* renamed from: u */
    private static boolean m18122u(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f12332w;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0030  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m18123v(byte[] r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            e.m.a.a$b r2 = new e.m.a.a$b     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            java.nio.ByteOrder r4 = r3.m18095G(r2)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r3.f12343h = r4     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r2.mo14160E(r4)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r1 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r1) goto L_0x001c
            r1 = 21330(0x5352, float:2.989E-41)
            if (r4 != r1) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r2.close()
            return r0
        L_0x0021:
            r4 = move-exception
            r1 = r2
            goto L_0x0027
        L_0x0024:
            r1 = r2
            goto L_0x002e
        L_0x0026:
            r4 = move-exception
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()
        L_0x002c:
            throw r4
        L_0x002d:
        L_0x002e:
            if (r1 == 0) goto L_0x0033
            r1.close()
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p134m.p135a.C4087a.m18123v(byte[]):boolean");
    }

    /* renamed from: w */
    private boolean m18124w(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f12297C;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: x */
    private boolean m18125x(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m18126y(byte[] r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            e.m.a.a$b r2 = new e.m.a.a$b     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            java.nio.ByteOrder r4 = r3.m18095G(r2)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r3.f12343h = r4     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r2.mo14160E(r4)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r1 = 85
            if (r4 != r1) goto L_0x0019
            r0 = 1
        L_0x0019:
            r2.close()
            return r0
        L_0x001d:
            r4 = move-exception
            r1 = r2
            goto L_0x0023
        L_0x0020:
            r1 = r2
            goto L_0x002a
        L_0x0022:
            r4 = move-exception
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()
        L_0x0028:
            throw r4
        L_0x0029:
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p134m.p135a.C4087a.m18126y(byte[]):boolean");
    }

    /* renamed from: z */
    private static boolean m18127z(FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Os.lseek(fileDescriptor, 0, OsConstants.SEEK_CUR);
                return true;
            } catch (Exception unused) {
                if (f12327r) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public String mo14155d(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        C4090c f = m18107f(str);
        if (f != null) {
            if (!f12322b0.contains(str)) {
                return f.mo14185j(this.f12343h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = f.f12361a;
                if (i == 5 || i == 10) {
                    C4092e[] eVarArr = (C4092e[]) f.mo14186k(this.f12343h);
                    if (eVarArr == null || eVarArr.length != 3) {
                        Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                        return null;
                    }
                    return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) eVarArr[0].f12368a) / ((float) eVarArr[0].f12369b))), Integer.valueOf((int) (((float) eVarArr[1].f12368a) / ((float) eVarArr[1].f12369b))), Integer.valueOf((int) (((float) eVarArr[2].f12368a) / ((float) eVarArr[2].f12369b)))});
                }
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + f.f12361a);
                return null;
            }
            try {
                return Double.toString(f.mo14183h(this.f12343h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public int mo14156e(String str, int i) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        C4090c f = m18107f(str);
        if (f == null) {
            return i;
        }
        try {
            return f.mo14184i(this.f12343h);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    private C4087a(InputStream inputStream, boolean z) throws IOException {
        C4091d[][] dVarArr = f12318X;
        this.f12341f = new HashMap[dVarArr.length];
        this.f12342g = new HashSet(dVarArr.length);
        this.f12343h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        this.f12336a = null;
        if (z) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            if (!m18120s(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f12340e = true;
            this.f12338c = null;
            this.f12337b = null;
            inputStream = bufferedInputStream;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f12338c = (AssetManager.AssetInputStream) inputStream;
            this.f12337b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (m18127z(fileInputStream.getFD())) {
                    this.f12338c = null;
                    this.f12337b = fileInputStream.getFD();
                }
            }
            this.f12338c = null;
            this.f12337b = null;
        }
        m18092D(inputStream);
    }

    /* renamed from: e.m.a.a$d */
    /* compiled from: ExifInterface */
    static class C4091d {

        /* renamed from: a */
        public final int f12364a;

        /* renamed from: b */
        public final String f12365b;

        /* renamed from: c */
        public final int f12366c;

        /* renamed from: d */
        public final int f12367d;

        C4091d(String str, int i, int i2) {
            this.f12365b = str;
            this.f12364a = i;
            this.f12366c = i2;
            this.f12367d = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo14188a(int i) {
            int i2;
            int i3 = this.f12366c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f12367d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            if ((i3 == 12 || i2 == 12) && i == 11) {
                return true;
            }
            return false;
        }

        C4091d(String str, int i, int i2, int i3) {
            this.f12365b = str;
            this.f12364a = i;
            this.f12366c = i2;
            this.f12367d = i3;
        }
    }
}

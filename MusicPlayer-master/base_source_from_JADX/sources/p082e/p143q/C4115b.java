package p082e.p143q;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: e.q.b */
/* compiled from: MultiDexExtractor */
final class C4115b implements Closeable {

    /* renamed from: g */
    private final File f12393g;

    /* renamed from: h */
    private final long f12394h;

    /* renamed from: i */
    private final File f12395i;

    /* renamed from: j */
    private final RandomAccessFile f12396j;

    /* renamed from: k */
    private final FileChannel f12397k;

    /* renamed from: l */
    private final FileLock f12398l;

    /* renamed from: e.q.b$a */
    /* compiled from: MultiDexExtractor */
    class C4116a implements FileFilter {
        C4116a(C4115b bVar) {
        }

        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* renamed from: e.q.b$b */
    /* compiled from: MultiDexExtractor */
    private static class C4117b extends File {
        public long crc = -1;

        public C4117b(File file, String str) {
            super(file, str);
        }
    }

    C4115b(File file, File file2) throws IOException {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f12393g = file;
        this.f12395i = file2;
        this.f12394h = m18196H(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f12396j = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f12397k = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f12398l = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                m18201d(this.f12397k);
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                m18201d(this.f12397k);
                throw e;
            } catch (Error e3) {
                e = e3;
                m18201d(this.f12397k);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            m18201d(this.f12396j);
            throw e4;
        }
    }

    /* renamed from: E */
    private static long m18195E(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* renamed from: H */
    private static long m18196H(File file) throws IOException {
        long c = C4118c.m18208c(file);
        return c == -1 ? c - 1 : c;
    }

    /* renamed from: K */
    private static boolean m18197K(Context context, File file, long j, String str) {
        SharedPreferences x = m18204x(context);
        if (x.getLong(str + "timestamp", -1) == m18195E(file)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("crc");
            return x.getLong(sb.toString(), -1) != j;
        }
    }

    /* renamed from: T */
    private List<C4117b> m18198T(Context context, String str) throws IOException {
        String str2 = str;
        Log.i("MultiDex", "loading existing secondary dex files");
        String str3 = this.f12393g.getName() + ".classes";
        SharedPreferences x = m18204x(context);
        int i = x.getInt(str2 + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + -1);
        int i2 = 2;
        while (i2 <= i) {
            C4117b bVar = new C4117b(this.f12395i, str3 + i2 + ".zip");
            if (bVar.isFile()) {
                bVar.crc = m18196H(bVar);
                long j = x.getLong(str2 + "dex.crc." + i2, -1);
                long j2 = x.getLong(str2 + "dex.time." + i2, -1);
                long lastModified = bVar.lastModified();
                if (j2 == lastModified) {
                    String str4 = str3;
                    SharedPreferences sharedPreferences = x;
                    if (j == bVar.crc) {
                        arrayList.add(bVar);
                        i2++;
                        x = sharedPreferences;
                        str3 = str4;
                    }
                }
                throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str2 + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + bVar.crc);
            }
            throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
        }
        return arrayList;
    }

    /* renamed from: Y */
    private List<C4117b> m18199Y() throws IOException {
        C4117b bVar;
        boolean z;
        String str = this.f12393g.getName() + ".classes";
        m18200c();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f12393g);
        try {
            ZipEntry entry = zipFile.getEntry("classes" + 2 + ".dex");
            int i = 2;
            while (entry != null) {
                bVar = new C4117b(this.f12395i, str + i + ".zip");
                arrayList.add(bVar);
                Log.i("MultiDex", "Extraction is needed for file " + bVar);
                int i2 = 0;
                boolean z2 = false;
                while (i2 < 3 && !z2) {
                    int i3 = i2 + 1;
                    m18203p(zipFile, entry, bVar, str);
                    bVar.crc = m18196H(bVar);
                    z = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(bVar.getAbsolutePath());
                    sb.append("': length ");
                    int i4 = i3;
                    sb.append(bVar.length());
                    sb.append(" - crc: ");
                    sb.append(bVar.crc);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + bVar.getPath() + "'");
                        }
                    }
                    z2 = z;
                    i2 = i4;
                }
                if (z2) {
                    i++;
                    entry = zipFile.getEntry("classes" + i + ".dex");
                } else {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException e) {
                Log.w("MultiDex", "Failed to close resource", e);
            }
            return arrayList;
        } catch (IOException e2) {
            Log.w("MultiDex", "Failed to read crc from " + bVar.getAbsolutePath(), e2);
            z = false;
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
            throw th2;
        }
    }

    /* renamed from: c */
    private void m18200c() {
        File[] listFiles = this.f12395i.listFiles(new C4116a(this));
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f12395i.getPath() + ").");
            return;
        }
        for (File file : listFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (!file.delete()) {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            } else {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            }
        }
    }

    /* renamed from: d */
    private static void m18201d(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    /* renamed from: i0 */
    private static void m18202i0(Context context, String str, long j, long j2, List<C4117b> list) {
        SharedPreferences.Editor edit = m18204x(context).edit();
        edit.putLong(str + "timestamp", j);
        edit.putLong(str + "crc", j2);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        for (C4117b next : list) {
            edit.putLong(str + "dex.crc." + i, next.crc);
            edit.putLong(str + "dex.time." + i, next.lastModified());
            i++;
        }
        edit.commit();
    }

    /* renamed from: p */
    private static void m18203p(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    m18201d(inputStream);
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } catch (Throwable th) {
            m18201d(inputStream);
            createTempFile.delete();
            throw th;
        }
    }

    /* renamed from: x */
    private static SharedPreferences m18204x(Context context) {
        return context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public List<? extends File> mo14207Q(Context context, String str, boolean z) throws IOException {
        List<C4117b> list;
        List<C4117b> list2;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f12393g.getPath() + ", " + z + ", " + str + ")");
        if (this.f12398l.isValid()) {
            if (z || m18197K(context, this.f12393g, this.f12394h, str)) {
                if (z) {
                    Log.i("MultiDex", "Forced extraction must be performed.");
                } else {
                    Log.i("MultiDex", "Detected that extraction must be performed.");
                }
                list2 = m18199Y();
                m18202i0(context, str, m18195E(this.f12393g), this.f12394h, list2);
            } else {
                try {
                    list = m18198T(context, str);
                } catch (IOException e) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                    list2 = m18199Y();
                    m18202i0(context, str, m18195E(this.f12393g), this.f12394h, list2);
                }
                Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
                return list;
            }
            list = list2;
            Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    public void close() throws IOException {
        this.f12398l.release();
        this.f12397k.close();
        this.f12396j.close();
    }
}

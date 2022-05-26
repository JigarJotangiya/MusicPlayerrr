package p159f.p166c.p199f.p200h;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: f.c.f.h.b */
/* compiled from: CutterCompat29Utils */
public class C4495b {

    /* renamed from: a */
    public static final Uri f13107a = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;

    /* renamed from: b */
    private static ContentValues f13108b = new ContentValues();

    /* renamed from: c */
    private static ContentValues f13109c = new ContentValues();

    /* renamed from: f.c.f.h.b$a */
    /* compiled from: CutterCompat29Utils */
    public interface C4496a {
        /* renamed from: a */
        void mo9485a(OutputStream outputStream, String str);

        /* renamed from: b */
        void mo9486b();
    }

    static {
        if (m19706e()) {
            f13108b.put("is_pending", 1);
            f13109c.put("is_pending", 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a1, code lost:
        if (r14 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a5, code lost:
        if (r14 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a7, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00aa, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x007e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x008c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] m19702a(android.content.Context r13, java.lang.String r14) {
        /*
            java.lang.String r0 = "title"
            r1 = 0
            if (r13 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.content.ContentResolver r2 = r13.getContentResolver()
            if (r2 != 0) goto L_0x000d
            return r1
        L_0x000d:
            android.net.Uri r3 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x00a4 }
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch:{ all -> 0x00a4 }
            java.lang.String r5 = "title like ?"
            r13 = 1
            java.lang.String[] r6 = new java.lang.String[r13]     // Catch:{ all -> 0x00a4 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a4 }
            r7.<init>()     // Catch:{ all -> 0x00a4 }
            r7.append(r14)     // Catch:{ all -> 0x00a4 }
            java.lang.String r14 = "%"
            r7.append(r14)     // Catch:{ all -> 0x00a4 }
            java.lang.String r14 = r7.toString()     // Catch:{ all -> 0x00a4 }
            r8 = 0
            r6[r8] = r14     // Catch:{ all -> 0x00a4 }
            r7 = 0
            android.database.Cursor r14 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a4 }
            if (r14 == 0) goto L_0x00a1
            boolean r2 = r14.moveToFirst()     // Catch:{ all -> 0x009f }
            if (r2 == 0) goto L_0x00a1
            int r2 = r14.getCount()     // Catch:{ all -> 0x009f }
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x009f }
            int r3 = r14.getCount()     // Catch:{ all -> 0x009f }
            int[] r3 = new int[r3]     // Catch:{ all -> 0x009f }
            r4 = 0
        L_0x0046:
            int r5 = r14.getColumnIndex(r0)     // Catch:{ all -> 0x009f }
            java.lang.String r5 = r14.getString(r5)     // Catch:{ all -> 0x009f }
            r2[r4] = r5     // Catch:{ all -> 0x009f }
            int r6 = r5.length()     // Catch:{ all -> 0x009f }
            int r7 = r6 + -1
            char r9 = r5.charAt(r7)     // Catch:{ all -> 0x009f }
            if (r6 <= r13) goto L_0x0063
            int r10 = r6 + -2
            char r10 = r5.charAt(r10)     // Catch:{ all -> 0x009f }
            goto L_0x0065
        L_0x0063:
            r10 = 32
        L_0x0065:
            r11 = 48
            if (r9 < r11) goto L_0x008f
            r12 = 57
            if (r9 > r12) goto L_0x008f
            if (r10 < r11) goto L_0x0081
            if (r10 > r12) goto L_0x0081
            int r6 = r6 + -2
            java.lang.String r5 = r5.substring(r6)     // Catch:{ all -> 0x009f }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ all -> 0x007e }
            r3[r4] = r5     // Catch:{ all -> 0x007e }
            goto L_0x0091
        L_0x007e:
            r3[r4] = r8     // Catch:{ all -> 0x009f }
            goto L_0x0091
        L_0x0081:
            java.lang.String r5 = r5.substring(r7)     // Catch:{ all -> 0x009f }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ all -> 0x008c }
            r3[r4] = r5     // Catch:{ all -> 0x008c }
            goto L_0x0091
        L_0x008c:
            r3[r4] = r8     // Catch:{ all -> 0x009f }
            goto L_0x0091
        L_0x008f:
            r3[r4] = r8     // Catch:{ all -> 0x009f }
        L_0x0091:
            int r4 = r4 + 1
            boolean r5 = r14.moveToNext()     // Catch:{ all -> 0x009f }
            if (r5 != 0) goto L_0x0046
            if (r14 == 0) goto L_0x009e
            r14.close()
        L_0x009e:
            return r3
        L_0x009f:
            goto L_0x00a5
        L_0x00a1:
            if (r14 == 0) goto L_0x00aa
            goto L_0x00a7
        L_0x00a4:
            r14 = r1
        L_0x00a5:
            if (r14 == 0) goto L_0x00aa
        L_0x00a7:
            r14.close()
        L_0x00aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p199f.p200h.C4495b.m19702a(android.content.Context, java.lang.String):int[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r8 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (0 == 0) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m19703b(android.content.Context r8, java.lang.String r9) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.content.ContentResolver r1 = r8.getContentResolver()
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            r8 = 0
            android.net.Uri r2 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x0031 }
            java.lang.String r3 = "title"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ all -> 0x0031 }
            java.lang.String r4 = "title like ?"
            r7 = 1
            java.lang.String[] r5 = new java.lang.String[r7]     // Catch:{ all -> 0x0031 }
            r5[r0] = r9     // Catch:{ all -> 0x0031 }
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0031 }
            if (r8 == 0) goto L_0x002e
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x0031 }
            if (r9 == 0) goto L_0x002e
            if (r8 == 0) goto L_0x002d
            r8.close()
        L_0x002d:
            return r7
        L_0x002e:
            if (r8 == 0) goto L_0x0037
            goto L_0x0034
        L_0x0031:
            if (r8 == 0) goto L_0x0037
        L_0x0034:
            r8.close()
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p199f.p200h.C4495b.m19703b(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: c */
    public static InputStream m19704c(Context context, long j) {
        ContentResolver contentResolver;
        if (context == null || (contentResolver = context.getContentResolver()) == null) {
            return null;
        }
        try {
            return contentResolver.openInputStream(ContentUris.withAppendedId(f13107a, j));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m19705d(Context context, int i, String str, String str2, C4496a aVar) {
        if (context == null) {
            aVar.mo9486b();
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            aVar.mo9486b();
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str + str2);
        contentValues.put("mime_type", "audio/*");
        contentValues.put("title", str);
        contentValues.put("duration", Integer.valueOf(i));
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("relative_path", "Music/Music Cutter/");
            contentValues.put("is_pending", 1);
        } else {
            contentValues.put("_data", C4494a.m19695d() + File.separator + str + str2);
        }
        Uri insert = contentResolver.insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (insert == null) {
            aVar.mo9486b();
            return;
        }
        try {
            OutputStream openOutputStream = contentResolver.openOutputStream(insert);
            if (openOutputStream == null) {
                aVar.mo9486b();
            } else {
                aVar.mo9485a(openOutputStream, insert.toString());
            }
        } catch (Throwable unused) {
            aVar.mo9486b();
        }
    }

    /* renamed from: e */
    public static boolean m19706e() {
        return Build.VERSION.SDK_INT >= 29;
    }

    /* renamed from: f */
    public static boolean m19707f(Context context, Uri uri) {
        ContentResolver contentResolver;
        if (context == null || (contentResolver = context.getContentResolver()) == null) {
            return false;
        }
        try {
            if (contentResolver.update(uri, f13109c, (String) null, (String[]) null) > 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }
}

package p082e.p109h.p116m;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.core.content.p003d.C0516c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p082e.p109h.p116m.C3670f;

/* renamed from: e.h.m.c */
/* compiled from: FontProvider */
class C3661c {

    /* renamed from: a */
    private static final Comparator<byte[]> f11632a = new C3662a();

    /* renamed from: e.h.m.c$a */
    /* compiled from: FontProvider */
    class C3662a implements Comparator<byte[]> {
        C3662a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(byte[] r5, byte[] r6) {
            /*
                r4 = this;
                int r0 = r5.length
                int r1 = r6.length
                if (r0 == r1) goto L_0x0008
                int r5 = r5.length
                int r6 = r6.length
            L_0x0006:
                int r5 = r5 - r6
                return r5
            L_0x0008:
                r0 = 0
                r1 = 0
            L_0x000a:
                int r2 = r5.length
                if (r1 >= r2) goto L_0x001b
                byte r2 = r5[r1]
                byte r3 = r6[r1]
                if (r2 == r3) goto L_0x0018
                byte r5 = r5[r1]
                byte r6 = r6[r1]
                goto L_0x0006
            L_0x0018:
                int r1 = r1 + 1
                goto L_0x000a
            L_0x001b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p109h.p116m.C3661c.C3662a.compare(byte[], byte[]):int");
        }
    }

    /* renamed from: a */
    private static List<byte[]> m15723a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m15724b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static List<List<byte[]>> m15725c(C3663d dVar, Resources resources) {
        if (dVar.mo12930b() != null) {
            return dVar.mo12930b();
        }
        return C0516c.m3196c(resources, dVar.mo12931c());
    }

    /* renamed from: d */
    static C3670f.C3671a m15726d(Context context, C3663d dVar, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo e = m15727e(context.getPackageManager(), dVar, context.getResources());
        if (e == null) {
            return C3670f.C3671a.m15748a(1, (C3670f.C3672b[]) null);
        }
        return C3670f.C3671a.m15748a(0, m15728f(context, dVar, e.authority, cancellationSignal));
    }

    /* renamed from: e */
    static ProviderInfo m15727e(PackageManager packageManager, C3663d dVar, Resources resources) throws PackageManager.NameNotFoundException {
        String e = dVar.mo12933e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e);
        } else if (resolveContentProvider.packageName.equals(dVar.mo12934f())) {
            List<byte[]> a = m15723a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a, f11632a);
            List<List<byte[]>> c = m15725c(dVar, resources);
            for (int i = 0; i < c.size(); i++) {
                ArrayList arrayList = new ArrayList(c.get(i));
                Collections.sort(arrayList, f11632a);
                if (m15724b(a, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + e + ", but package was not " + dVar.mo12934f());
        }
    }

    /* renamed from: f */
    static C3670f.C3672b[] m15728f(Context context, C3663d dVar, String str, CancellationSignal cancellationSignal) {
        int i;
        Uri uri;
        Cursor query;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            if (Build.VERSION.SDK_INT > 16) {
                query = context.getContentResolver().query(build, strArr, "query = ?", new String[]{dVar.mo12935g()}, (String) null, cancellationSignal);
            } else {
                query = context.getContentResolver().query(build, strArr, "query = ?", new String[]{dVar.mo12935g()}, (String) null);
            }
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i2 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i3 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        i = i2;
                        uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i = i2;
                        uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    arrayList2.add(C3670f.C3672b.m15751a(uri, i3, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (C3670f.C3672b[]) arrayList.toArray(new C3670f.C3672b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}

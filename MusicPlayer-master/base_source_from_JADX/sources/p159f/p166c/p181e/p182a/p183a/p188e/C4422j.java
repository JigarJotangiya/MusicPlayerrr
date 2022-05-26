package p159f.p166c.p181e.p182a.p183a.p188e;

/* renamed from: f.c.e.a.a.e.j */
/* compiled from: LyricLoader.kt */
public final class C4422j {

    /* renamed from: a */
    public static final C4422j f13001a = new C4422j();

    private C4422j() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009a, code lost:
        if (r11 == null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009c, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a6, code lost:
        if (r11 == null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a9, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo14989a(android.content.Context r11) {
        /*
            r10 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r11, r0)
            java.lang.String r0 = ".lrc"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "external"
            android.net.Uri r4 = android.provider.MediaStore.Files.getContentUri(r2)
            java.lang.String r2 = "_data"
            java.lang.String r3 = "title"
            java.lang.String[] r5 = new java.lang.String[]{r2, r3}
            r9 = 0
            java.lang.String r3 = ""
            r6 = r3
            r3 = 0
        L_0x0023:
            r7 = 1
            if (r3 >= r7) goto L_0x0074
            if (r3 == 0) goto L_0x0039
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = " OR "
            r7.append(r6)
            java.lang.String r6 = r7.toString()
        L_0x0039:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r2)
            java.lang.String r6 = " LIKE '%"
            r7.append(r6)
            r6 = r0[r3]
            r7.append(r6)
            java.lang.String r6 = "'"
            r7.append(r6)
            java.lang.String r8 = " AND "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r8 = " NOT LIKE "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = "/storage/emulated/0/Android/"
            r7.append(r6)
            java.lang.String r6 = "%'"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            int r3 = r3 + 1
            goto L_0x0023
        L_0x0074:
            java.lang.String r8 = "date_modified"
            android.content.ContentResolver r3 = r11.getContentResolver()
            r11 = 0
            r7 = 0
            android.database.Cursor r11 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            if (r11 == 0) goto L_0x009a
            boolean r0 = r11.moveToLast()     // Catch:{ Exception -> 0x00a2 }
            if (r0 == 0) goto L_0x009a
        L_0x0088:
            java.lang.String r0 = r11.getString(r9)     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r2 = "data"
            p369i.p387z.p389d.C8594l.m46770d(r0, r2)     // Catch:{ Exception -> 0x00a2 }
            r1.add(r0)     // Catch:{ Exception -> 0x00a2 }
            boolean r0 = r11.moveToPrevious()     // Catch:{ Exception -> 0x00a2 }
            if (r0 != 0) goto L_0x0088
        L_0x009a:
            if (r11 == 0) goto L_0x00a9
        L_0x009c:
            r11.close()
            goto L_0x00a9
        L_0x00a0:
            r0 = move-exception
            goto L_0x00aa
        L_0x00a2:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x00a0 }
            if (r11 == 0) goto L_0x00a9
            goto L_0x009c
        L_0x00a9:
            return r1
        L_0x00aa:
            if (r11 == 0) goto L_0x00af
            r11.close()
        L_0x00af:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p188e.C4422j.mo14989a(android.content.Context):java.util.List");
    }
}

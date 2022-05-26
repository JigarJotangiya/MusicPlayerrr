package p159f.p166c.p171b.p174c;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.preference.PreferenceManager;
import java.util.Objects;
import p159f.p166c.p171b.p172a.C4313a;
import p159f.p166c.p171b.p172a.C4315c;
import p159f.p166c.p171b.p173b.C4317b;
import p159f.p332g.p333a.C7739a;
import p369i.C8457t;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.b.c.a */
/* compiled from: BaseDatabaseManager.kt */
public class C4318a extends C4321d {

    /* renamed from: a */
    private SQLiteDatabase f12907a;

    public C4318a(Context context, C4317b bVar) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(bVar, "sqLiteHelper");
        try {
            this.f12907a = bVar.mo14726c();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                this.f12907a = bVar.mo14726c();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        mo14736f(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        if (r6 != null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008f, code lost:
        r6.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009b, code lost:
        if (r6 == null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009e, code lost:
        return r7;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m18878i(int r6, java.lang.String r7, java.lang.Object r8) {
        /*
            r5 = this;
            f.c.b.c.c r0 = p159f.p166c.p171b.p174c.C4320c.f12910c
            f.c.b.a.a r0 = r0.mo14740a()
            android.database.sqlite.SQLiteDatabase r1 = r5.f12907a
            if (r1 == 0) goto L_0x000d
            r1.beginTransaction()
        L_0x000d:
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.String r2 = r0.mo14695e()
            boolean r2 = p369i.p387z.p389d.C8594l.m46767a(r7, r2)
            if (r2 == 0) goto L_0x002c
            boolean r7 = r8 instanceof java.lang.String
            if (r7 == 0) goto L_0x0045
            java.lang.String r7 = r0.mo14695e()
            if (r7 == 0) goto L_0x0045
            java.lang.String r8 = (java.lang.String) r8
            r1.put(r7, r8)
            goto L_0x0045
        L_0x002c:
            java.lang.String r2 = r0.mo14697g()
            boolean r7 = p369i.p387z.p389d.C8594l.m46767a(r7, r2)
            if (r7 == 0) goto L_0x00a7
            boolean r7 = r8 instanceof java.lang.Integer
            if (r7 == 0) goto L_0x0045
            java.lang.String r7 = r0.mo14697g()
            if (r7 == 0) goto L_0x0045
            java.lang.Integer r8 = (java.lang.Integer) r8
            r1.put(r7, r8)
        L_0x0045:
            r7 = -1
            android.database.sqlite.SQLiteDatabase r8 = r5.f12907a     // Catch:{ Exception -> 0x0095 }
            if (r8 == 0) goto L_0x0084
            java.lang.Boolean r2 = r0.mo14702l()     // Catch:{ Exception -> 0x0095 }
            p369i.p387z.p389d.C8594l.m46769c(r2)     // Catch:{ Exception -> 0x0095 }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0095 }
            if (r2 == 0) goto L_0x005c
            java.lang.String r2 = r0.mo14699i()     // Catch:{ Exception -> 0x0095 }
            goto L_0x0060
        L_0x005c:
            java.lang.String r2 = r0.mo14698h()     // Catch:{ Exception -> 0x0095 }
        L_0x0060:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095 }
            r3.<init>()     // Catch:{ Exception -> 0x0095 }
            java.lang.String r0 = r0.mo14694d()     // Catch:{ Exception -> 0x0095 }
            r3.append(r0)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r0 = " = ?"
            r3.append(r0)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0095 }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0095 }
            r4 = 0
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0095 }
            r3[r4] = r6     // Catch:{ Exception -> 0x0095 }
            int r6 = r8.update(r2, r1, r0, r3)     // Catch:{ Exception -> 0x0095 }
            r7 = r6
        L_0x0084:
            android.database.sqlite.SQLiteDatabase r6 = r5.f12907a     // Catch:{ Exception -> 0x0095 }
            if (r6 == 0) goto L_0x008b
            r6.setTransactionSuccessful()     // Catch:{ Exception -> 0x0095 }
        L_0x008b:
            android.database.sqlite.SQLiteDatabase r6 = r5.f12907a
            if (r6 == 0) goto L_0x009e
        L_0x008f:
            r6.endTransaction()
            goto L_0x009e
        L_0x0093:
            r6 = move-exception
            goto L_0x009f
        L_0x0095:
            r6 = move-exception
            r6.printStackTrace()     // Catch:{ all -> 0x0093 }
            android.database.sqlite.SQLiteDatabase r6 = r5.f12907a
            if (r6 == 0) goto L_0x009e
            goto L_0x008f
        L_0x009e:
            return r7
        L_0x009f:
            android.database.sqlite.SQLiteDatabase r7 = r5.f12907a
            if (r7 == 0) goto L_0x00a6
            r7.endTransaction()
        L_0x00a6:
            throw r6
        L_0x00a7:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "This key cannot be found! please check !"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p171b.p174c.C4318a.m18878i(int, java.lang.String, java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        if (r7 != null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        r7.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r7 == null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo14731a(int r7) {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.f12907a
            if (r0 == 0) goto L_0x0007
            r0.beginTransaction()
        L_0x0007:
            r0 = -1
            f.c.b.c.c r1 = p159f.p166c.p171b.p174c.C4320c.f12910c     // Catch:{ Exception -> 0x005d }
            f.c.b.a.a r1 = r1.mo14740a()     // Catch:{ Exception -> 0x005d }
            android.database.sqlite.SQLiteDatabase r2 = r6.f12907a     // Catch:{ Exception -> 0x005d }
            if (r2 == 0) goto L_0x004c
            java.lang.Boolean r3 = r1.mo14702l()     // Catch:{ Exception -> 0x005d }
            p369i.p387z.p389d.C8594l.m46769c(r3)     // Catch:{ Exception -> 0x005d }
            boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x005d }
            if (r3 == 0) goto L_0x0024
            java.lang.String r3 = r1.mo14699i()     // Catch:{ Exception -> 0x005d }
            goto L_0x0028
        L_0x0024:
            java.lang.String r3 = r1.mo14698h()     // Catch:{ Exception -> 0x005d }
        L_0x0028:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005d }
            r4.<init>()     // Catch:{ Exception -> 0x005d }
            java.lang.String r1 = r1.mo14694d()     // Catch:{ Exception -> 0x005d }
            r4.append(r1)     // Catch:{ Exception -> 0x005d }
            java.lang.String r1 = " = ?"
            r4.append(r1)     // Catch:{ Exception -> 0x005d }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x005d }
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ Exception -> 0x005d }
            r5 = 0
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x005d }
            r4[r5] = r7     // Catch:{ Exception -> 0x005d }
            int r7 = r2.delete(r3, r1, r4)     // Catch:{ Exception -> 0x005d }
            r0 = r7
        L_0x004c:
            android.database.sqlite.SQLiteDatabase r7 = r6.f12907a     // Catch:{ Exception -> 0x005d }
            if (r7 == 0) goto L_0x0053
            r7.setTransactionSuccessful()     // Catch:{ Exception -> 0x005d }
        L_0x0053:
            android.database.sqlite.SQLiteDatabase r7 = r6.f12907a
            if (r7 == 0) goto L_0x0066
        L_0x0057:
            r7.endTransaction()
            goto L_0x0066
        L_0x005b:
            r7 = move-exception
            goto L_0x0067
        L_0x005d:
            r7 = move-exception
            r7.printStackTrace()     // Catch:{ all -> 0x005b }
            android.database.sqlite.SQLiteDatabase r7 = r6.f12907a
            if (r7 == 0) goto L_0x0066
            goto L_0x0057
        L_0x0066:
            return r0
        L_0x0067:
            android.database.sqlite.SQLiteDatabase r0 = r6.f12907a
            if (r0 == 0) goto L_0x006e
            r0.endTransaction()
        L_0x006e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p171b.p174c.C4318a.mo14731a(int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012e, code lost:
        if (r11 != null) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0130, code lost:
        r11.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013c, code lost:
        if (r11 == null) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013f, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0129 A[Catch:{ Exception -> 0x0136, all -> 0x0134 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo14732b(p159f.p166c.p171b.p172a.C4315c r11) {
        /*
            r10 = this;
            java.lang.String r0 = "person"
            p369i.p387z.p389d.C8594l.m46771e(r11, r0)
            android.database.sqlite.SQLiteDatabase r0 = r10.f12907a
            if (r0 == 0) goto L_0x000c
            r0.beginTransaction()
        L_0x000c:
            r0 = -1
            f.c.b.c.c r1 = p159f.p166c.p171b.p174c.C4320c.f12910c     // Catch:{ Exception -> 0x0136 }
            f.c.b.a.a r1 = r1.mo14740a()     // Catch:{ Exception -> 0x0136 }
            java.lang.Boolean r2 = r1.mo14702l()     // Catch:{ Exception -> 0x0136 }
            p369i.p387z.p389d.C8594l.m46769c(r2)     // Catch:{ Exception -> 0x0136 }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0136 }
            java.lang.String r3 = "0"
            r4 = 0
            if (r2 == 0) goto L_0x00a4
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ Exception -> 0x0136 }
            r2.<init>()     // Catch:{ Exception -> 0x0136 }
            java.lang.String r5 = r1.mo14695e()     // Catch:{ Exception -> 0x0136 }
            if (r5 == 0) goto L_0x0037
            java.lang.String r6 = r11.mo14714c()     // Catch:{ Exception -> 0x0136 }
            r2.put(r5, r6)     // Catch:{ Exception -> 0x0136 }
            i.t r5 = p369i.C8457t.f34900a     // Catch:{ Exception -> 0x0136 }
        L_0x0037:
            java.lang.String[] r5 = r1.mo14692b()     // Catch:{ Exception -> 0x0136 }
            if (r5 == 0) goto L_0x0053
            int r6 = r5.length     // Catch:{ Exception -> 0x0136 }
            r7 = 0
        L_0x003f:
            if (r7 >= r6) goto L_0x0051
            r8 = r5[r7]     // Catch:{ Exception -> 0x0136 }
            int r9 = r11.mo14717f(r7)     // Catch:{ Exception -> 0x0136 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0136 }
            r2.put(r8, r9)     // Catch:{ Exception -> 0x0136 }
            int r7 = r7 + 1
            goto L_0x003f
        L_0x0051:
            i.t r5 = p369i.C8457t.f34900a     // Catch:{ Exception -> 0x0136 }
        L_0x0053:
            java.lang.String[] r5 = r1.mo14701k()     // Catch:{ Exception -> 0x0136 }
            if (r5 == 0) goto L_0x0070
            int r6 = r5.length     // Catch:{ Exception -> 0x0136 }
        L_0x005a:
            if (r4 >= r6) goto L_0x006e
            r7 = r5[r4]     // Catch:{ Exception -> 0x0136 }
            int[] r8 = r11.mo14716e()     // Catch:{ Exception -> 0x0136 }
            r8 = r8[r4]     // Catch:{ Exception -> 0x0136 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0136 }
            r2.put(r7, r8)     // Catch:{ Exception -> 0x0136 }
            int r4 = r4 + 1
            goto L_0x005a
        L_0x006e:
            i.t r4 = p369i.C8457t.f34900a     // Catch:{ Exception -> 0x0136 }
        L_0x0070:
            java.lang.String r4 = r1.mo14697g()     // Catch:{ Exception -> 0x0136 }
            if (r4 == 0) goto L_0x0083
            int r5 = r10.mo14737g()     // Catch:{ Exception -> 0x0136 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0136 }
            r2.put(r4, r5)     // Catch:{ Exception -> 0x0136 }
            i.t r4 = p369i.C8457t.f34900a     // Catch:{ Exception -> 0x0136 }
        L_0x0083:
            java.lang.String r4 = r1.mo14693c()     // Catch:{ Exception -> 0x0136 }
            if (r4 == 0) goto L_0x0096
            int r11 = r11.mo14712a()     // Catch:{ Exception -> 0x0136 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0136 }
            r2.put(r4, r11)     // Catch:{ Exception -> 0x0136 }
            i.t r11 = p369i.C8457t.f34900a     // Catch:{ Exception -> 0x0136 }
        L_0x0096:
            android.database.sqlite.SQLiteDatabase r11 = r10.f12907a     // Catch:{ Exception -> 0x0136 }
            if (r11 == 0) goto L_0x0125
            java.lang.String r1 = r1.mo14699i()     // Catch:{ Exception -> 0x0136 }
            long r0 = r11.insert(r1, r3, r2)     // Catch:{ Exception -> 0x0136 }
            goto L_0x0123
        L_0x00a4:
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ Exception -> 0x0136 }
            r2.<init>()     // Catch:{ Exception -> 0x0136 }
            java.lang.String r5 = r1.mo14695e()     // Catch:{ Exception -> 0x0136 }
            if (r5 == 0) goto L_0x00b8
            java.lang.String r6 = r11.mo14714c()     // Catch:{ Exception -> 0x0136 }
            r2.put(r5, r6)     // Catch:{ Exception -> 0x0136 }
            i.t r5 = p369i.C8457t.f34900a     // Catch:{ Exception -> 0x0136 }
        L_0x00b8:
            java.lang.String[] r5 = r1.mo14691a()     // Catch:{ Exception -> 0x0136 }
            if (r5 == 0) goto L_0x00d4
            int r6 = r5.length     // Catch:{ Exception -> 0x0136 }
            r7 = 0
        L_0x00c0:
            if (r7 >= r6) goto L_0x00d2
            r8 = r5[r7]     // Catch:{ Exception -> 0x0136 }
            int r9 = r11.mo14717f(r7)     // Catch:{ Exception -> 0x0136 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0136 }
            r2.put(r8, r9)     // Catch:{ Exception -> 0x0136 }
            int r7 = r7 + 1
            goto L_0x00c0
        L_0x00d2:
            i.t r5 = p369i.C8457t.f34900a     // Catch:{ Exception -> 0x0136 }
        L_0x00d4:
            java.lang.String[] r5 = r1.mo14700j()     // Catch:{ Exception -> 0x0136 }
            if (r5 == 0) goto L_0x00f1
            int r6 = r5.length     // Catch:{ Exception -> 0x0136 }
        L_0x00db:
            if (r4 >= r6) goto L_0x00ef
            r7 = r5[r4]     // Catch:{ Exception -> 0x0136 }
            int[] r8 = r11.mo14716e()     // Catch:{ Exception -> 0x0136 }
            r8 = r8[r4]     // Catch:{ Exception -> 0x0136 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0136 }
            r2.put(r7, r8)     // Catch:{ Exception -> 0x0136 }
            int r4 = r4 + 1
            goto L_0x00db
        L_0x00ef:
            i.t r4 = p369i.C8457t.f34900a     // Catch:{ Exception -> 0x0136 }
        L_0x00f1:
            java.lang.String r4 = r1.mo14697g()     // Catch:{ Exception -> 0x0136 }
            if (r4 == 0) goto L_0x0104
            int r5 = r10.mo14737g()     // Catch:{ Exception -> 0x0136 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0136 }
            r2.put(r4, r5)     // Catch:{ Exception -> 0x0136 }
            i.t r4 = p369i.C8457t.f34900a     // Catch:{ Exception -> 0x0136 }
        L_0x0104:
            java.lang.String r4 = r1.mo14693c()     // Catch:{ Exception -> 0x0136 }
            if (r4 == 0) goto L_0x0117
            int r11 = r11.mo14712a()     // Catch:{ Exception -> 0x0136 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0136 }
            r2.put(r4, r11)     // Catch:{ Exception -> 0x0136 }
            i.t r11 = p369i.C8457t.f34900a     // Catch:{ Exception -> 0x0136 }
        L_0x0117:
            android.database.sqlite.SQLiteDatabase r11 = r10.f12907a     // Catch:{ Exception -> 0x0136 }
            if (r11 == 0) goto L_0x0125
            java.lang.String r1 = r1.mo14698h()     // Catch:{ Exception -> 0x0136 }
            long r0 = r11.insert(r1, r3, r2)     // Catch:{ Exception -> 0x0136 }
        L_0x0123:
            int r11 = (int) r0     // Catch:{ Exception -> 0x0136 }
            r0 = r11
        L_0x0125:
            android.database.sqlite.SQLiteDatabase r11 = r10.f12907a     // Catch:{ Exception -> 0x0136 }
            if (r11 == 0) goto L_0x012c
            r11.setTransactionSuccessful()     // Catch:{ Exception -> 0x0136 }
        L_0x012c:
            android.database.sqlite.SQLiteDatabase r11 = r10.f12907a
            if (r11 == 0) goto L_0x013f
        L_0x0130:
            r11.endTransaction()
            goto L_0x013f
        L_0x0134:
            r11 = move-exception
            goto L_0x0140
        L_0x0136:
            r11 = move-exception
            r11.printStackTrace()     // Catch:{ all -> 0x0134 }
            android.database.sqlite.SQLiteDatabase r11 = r10.f12907a
            if (r11 == 0) goto L_0x013f
            goto L_0x0130
        L_0x013f:
            return r0
        L_0x0140:
            android.database.sqlite.SQLiteDatabase r0 = r10.f12907a
            if (r0 == 0) goto L_0x0147
            r0.endTransaction()
        L_0x0147:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p171b.p174c.C4318a.mo14732b(f.c.b.a.c):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a7  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<p159f.p166c.p171b.p172a.C4315c> mo14733c() {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            f.c.b.c.c r1 = p159f.p166c.p171b.p174c.C4320c.f12910c
            f.c.b.a.a r2 = r1.mo14740a()
            f.c.b.a.b r2 = r2.mo14696f()
            int r2 = r2.mo14711a()
            r3 = 0
            if (r2 == 0) goto L_0x0083
            java.lang.String r4 = " desc"
            r5 = 1
            if (r2 == r5) goto L_0x005d
            r5 = 2
            if (r2 == r5) goto L_0x0047
            r5 = 3
            if (r2 == r5) goto L_0x0022
            goto L_0x0083
        L_0x0022:
            f.c.b.a.a r2 = r1.mo14740a()
            java.lang.String r2 = r2.mo14697g()
            if (r2 == 0) goto L_0x0083
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            f.c.b.a.a r5 = r1.mo14740a()
            java.lang.String r5 = r5.mo14697g()
            p369i.p387z.p389d.C8594l.m46769c(r5)
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            goto L_0x0081
        L_0x0047:
            f.c.b.a.a r2 = r1.mo14740a()
            java.lang.String r2 = r2.mo14697g()
            if (r2 == 0) goto L_0x0083
            f.c.b.a.a r2 = r1.mo14740a()
            java.lang.String r2 = r2.mo14697g()
            p369i.p387z.p389d.C8594l.m46769c(r2)
            goto L_0x0081
        L_0x005d:
            f.c.b.a.a r2 = r1.mo14740a()
            java.lang.String r2 = r2.mo14694d()
            if (r2 == 0) goto L_0x0083
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            f.c.b.a.a r5 = r1.mo14740a()
            java.lang.String r5 = r5.mo14694d()
            p369i.p387z.p389d.C8594l.m46769c(r5)
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
        L_0x0081:
            r11 = r2
            goto L_0x0084
        L_0x0083:
            r11 = r3
        L_0x0084:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "orderBy="
            r2.append(r4)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "BaseDatabaseManager"
            android.util.Log.v(r4, r2)
            android.database.sqlite.SQLiteDatabase r4 = r12.f12907a
            if (r4 == 0) goto L_0x00ca
            f.c.b.a.a r2 = r1.mo14740a()
            java.lang.Boolean r2 = r2.mo14702l()
            p369i.p387z.p389d.C8594l.m46769c(r2)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00b8
            f.c.b.a.a r2 = r1.mo14740a()
            java.lang.String r2 = r2.mo14699i()
            goto L_0x00c0
        L_0x00b8:
            f.c.b.a.a r2 = r1.mo14740a()
            java.lang.String r2 = r2.mo14698h()
        L_0x00c0:
            r5 = r2
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11)
        L_0x00ca:
            f.c.b.d.a$a r2 = p159f.p166c.p171b.p175d.C4324a.f12916c
            int r4 = r2.mo14747a()
            int[] r4 = new int[r4]
            int r2 = r2.mo14747a()
            int[] r2 = new int[r2]
            if (r3 == 0) goto L_0x01a5
            f.c.b.a.a r1 = r1.mo14740a()
        L_0x00de:
            boolean r5 = r3.moveToNext()
            if (r5 == 0) goto L_0x01a5
            f.c.b.a.c r5 = new f.c.b.a.c
            r5.<init>()
            java.lang.String r6 = r1.mo14694d()
            if (r6 == 0) goto L_0x00fa
            int r6 = r3.getColumnIndex(r6)
            int r6 = r3.getInt(r6)
            r5.mo14720i(r6)
        L_0x00fa:
            java.lang.String r6 = r1.mo14695e()
            if (r6 == 0) goto L_0x0110
            int r6 = r3.getColumnIndex(r6)
            java.lang.String r6 = r3.getString(r6)
            java.lang.String r7 = "c.getString(c.getColumnIndex(it))"
            p369i.p387z.p389d.C8594l.m46770d(r6, r7)
            r5.mo14721j(r6)
        L_0x0110:
            java.lang.String[] r6 = r1.mo14692b()
            r7 = 0
            if (r6 == 0) goto L_0x0148
            java.lang.String[] r8 = r1.mo14691a()
            if (r8 == 0) goto L_0x0148
            f.c.b.d.a$a r9 = p159f.p166c.p171b.p175d.C4324a.f12916c
            int r9 = r9.mo14747a()
            r10 = 0
        L_0x0124:
            if (r10 >= r9) goto L_0x0145
            java.lang.Boolean r11 = r1.mo14702l()
            p369i.p387z.p389d.C8594l.m46769c(r11)
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0136
            r11 = r6[r10]
            goto L_0x0138
        L_0x0136:
            r11 = r8[r10]
        L_0x0138:
            int r11 = r3.getColumnIndex(r11)
            int r11 = r3.getInt(r11)
            r4[r10] = r11
            int r10 = r10 + 1
            goto L_0x0124
        L_0x0145:
            r5.mo14724m(r4)
        L_0x0148:
            java.lang.String[] r6 = r1.mo14701k()
            if (r6 == 0) goto L_0x017e
            java.lang.String[] r8 = r1.mo14700j()
            if (r8 == 0) goto L_0x017e
            f.c.b.d.a$a r9 = p159f.p166c.p171b.p175d.C4324a.f12916c
            int r9 = r9.mo14747a()
        L_0x015a:
            if (r7 >= r9) goto L_0x017b
            java.lang.Boolean r10 = r1.mo14702l()
            p369i.p387z.p389d.C8594l.m46769c(r10)
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x016c
            r10 = r6[r7]
            goto L_0x016e
        L_0x016c:
            r10 = r8[r7]
        L_0x016e:
            int r10 = r3.getColumnIndex(r10)
            int r10 = r3.getInt(r10)
            r2[r7] = r10
            int r7 = r7 + 1
            goto L_0x015a
        L_0x017b:
            r5.mo14723l(r2)
        L_0x017e:
            java.lang.String r6 = r1.mo14697g()
            if (r6 == 0) goto L_0x018f
            int r6 = r3.getColumnIndex(r6)
            int r6 = r3.getInt(r6)
            r5.mo14722k(r6)
        L_0x018f:
            java.lang.String r6 = r1.mo14693c()
            if (r6 == 0) goto L_0x01a0
            int r6 = r3.getColumnIndex(r6)
            int r6 = r3.getInt(r6)
            r5.mo14719h(r6)
        L_0x01a0:
            r0.add(r5)
            goto L_0x00de
        L_0x01a5:
            if (r3 == 0) goto L_0x01aa
            r3.close()
        L_0x01aa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p171b.p174c.C4318a.mo14733c():java.util.List");
    }

    /* renamed from: d */
    public int mo14734d(int i, String str) {
        C8594l.m46771e(str, "name");
        String e = C4320c.f12910c.mo14740a().mo14695e();
        if (e != null) {
            return m18878i(i, e, str);
        }
        return -1;
    }

    /* renamed from: e */
    public void mo14735e(Context context) {
        String[] strArr;
        int i;
        C8594l.m46771e(context, "context");
        String[] stringArray = context.getResources().getStringArray(C7739a.equalizer_old_eq_name);
        C8594l.m46770d(stringArray, "context.resources.getStr…ay.equalizer_old_eq_name)");
        String[] stringArray2 = context.getResources().getStringArray(C7739a.equalizer_old_eq_name_value);
        C8594l.m46770d(stringArray2, "context.resources.getStr…alizer_old_eq_name_value)");
        int length = stringArray.length - 10;
        C4315c[] cVarArr = new C4315c[length];
        mo14739j(context);
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + 10;
            if (stringArray2[i4] == null) {
                Object[] array = C8437p.m46547V("0,0,0,0,0", new String[]{","}, false, 0, 6, (Object) null).toArray(new String[i2]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                strArr = (String[]) array;
            } else {
                String str = stringArray2[i4];
                C8594l.m46769c(str);
                Object[] array2 = C8437p.m46547V(str, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[i2]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                strArr = (String[]) array2;
            }
            C4315c cVar = new C4315c();
            String str2 = stringArray[i4];
            C8594l.m46770d(str2, "presetNames[index]");
            cVar.mo14721j(str2);
            int[] iArr = new int[5];
            int i5 = 0;
            while (i5 <= 4) {
                int i6 = i5 + 1;
                if (strArr.length >= i6) {
                    String str3 = strArr[i5];
                    int length2 = str3.length() - 1;
                    boolean z = false;
                    while (i2 <= length2) {
                        boolean z2 = C8594l.m46773g(str3.charAt(!z ? i2 : length2), 32) <= 0;
                        if (!z) {
                            if (!z2) {
                                z = true;
                            } else {
                                i2++;
                            }
                        } else if (!z2) {
                            break;
                        } else {
                            length2--;
                        }
                    }
                    i = Integer.parseInt(str3.subSequence(i2, length2 + 1).toString());
                } else {
                    i = Integer.parseInt("0");
                }
                iArr[i5] = i;
                i5 = i6;
                i2 = 0;
            }
            cVar.mo14724m(iArr);
            int[] iArr2 = new int[5];
            for (int i7 = 0; i7 <= 4; i7++) {
                iArr2[i7] = 1;
            }
            cVar.mo14723l(iArr2);
            cVar.mo14722k(mo14737g() + i3);
            cVar.mo14719h(i4);
            C8457t tVar = C8457t.f34900a;
            cVarArr[i3] = cVar;
            i3++;
            i2 = 0;
        }
        mo14738h(cVarArr);
    }

    /* renamed from: f */
    public void mo14736f(Context context) {
        C8594l.m46771e(context, "context");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences.getBoolean("isFirstChangeDB", true)) {
            mo14735e(context);
            SharedPreferences.Editor edit = defaultSharedPreferences.edit();
            edit.putBoolean("isFirstChangeDB", false);
            edit.apply();
        }
    }

    /* renamed from: g */
    public int mo14737g() {
        C4320c cVar = C4320c.f12910c;
        String d = cVar.mo14740a().mo14694d();
        if (d != null) {
            SQLiteDatabase sQLiteDatabase = this.f12907a;
            Cursor cursor = null;
            if (sQLiteDatabase != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("select max(");
                sb.append(d);
                sb.append(") from ");
                Boolean l = cVar.mo14740a().mo14702l();
                C8594l.m46769c(l);
                boolean booleanValue = l.booleanValue();
                C4313a a = cVar.mo14740a();
                sb.append(booleanValue ? a.mo14699i() : a.mo14698h());
                cursor = sQLiteDatabase.rawQuery(sb.toString(), (String[]) null);
            }
            if (cursor != null && cursor.moveToLast()) {
                int i = cursor.getInt(0);
                cursor.close();
                return i;
            } else if (cursor != null) {
                cursor.close();
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo14738h(C4315c[] cVarArr) {
        SQLiteDatabase sQLiteDatabase;
        C8594l.m46771e(cVarArr, "person");
        SQLiteDatabase sQLiteDatabase2 = this.f12907a;
        if (sQLiteDatabase2 != null) {
            sQLiteDatabase2.beginTransaction();
        }
        try {
            C4313a a = C4320c.f12910c.mo14740a();
            for (C4315c cVar : cVarArr) {
                if (cVar != null) {
                    ContentValues contentValues = new ContentValues();
                    String e = a.mo14695e();
                    if (e != null) {
                        contentValues.put(e, cVar.mo14714c());
                    }
                    String[] a2 = a.mo14691a();
                    if (a2 != null) {
                        int length = a2.length;
                        for (int i = 0; i < length; i++) {
                            contentValues.put(a2[i], Integer.valueOf(cVar.mo14717f(i)));
                        }
                    }
                    String[] j = a.mo14700j();
                    if (j != null) {
                        int length2 = j.length;
                        for (int i2 = 0; i2 < length2; i2++) {
                            contentValues.put(j[i2], Integer.valueOf(cVar.mo14716e()[i2]));
                        }
                    }
                    String g = a.mo14697g();
                    if (g != null) {
                        contentValues.put(g, Integer.valueOf(cVar.mo14715d()));
                    }
                    String c = a.mo14693c();
                    if (c != null) {
                        contentValues.put(c, Integer.valueOf(cVar.mo14712a()));
                    }
                    SQLiteDatabase sQLiteDatabase3 = this.f12907a;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.insert(C4320c.f12910c.mo14740a().mo14698h(), "0", contentValues);
                    }
                }
            }
            SQLiteDatabase sQLiteDatabase4 = this.f12907a;
            if (sQLiteDatabase4 != null) {
                sQLiteDatabase4.setTransactionSuccessful();
            }
            sQLiteDatabase = this.f12907a;
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (SQLiteConstraintException e2) {
            e2.printStackTrace();
            sQLiteDatabase = this.f12907a;
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Throwable th) {
            SQLiteDatabase sQLiteDatabase5 = this.f12907a;
            if (sQLiteDatabase5 != null) {
                sQLiteDatabase5.endTransaction();
            }
            throw th;
        }
        sQLiteDatabase.endTransaction();
    }

    /* renamed from: j */
    public void mo14739j(Context context) {
        C8594l.m46771e(context, "context");
    }
}

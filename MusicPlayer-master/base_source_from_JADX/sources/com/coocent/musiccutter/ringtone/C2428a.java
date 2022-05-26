package com.coocent.musiccutter.ringtone;

import android.app.Application;
import android.text.TextUtils;
import com.coocent.musiccutter.ringtone.C2438d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import p159f.p166c.p199f.p200h.C4495b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.coocent.musiccutter.ringtone.a */
/* compiled from: CheapAAC */
public class C2428a extends C2438d {

    /* renamed from: t */
    public static final int[] f8499t = {1684631142, 1751411826, 1835296868, 1835297121, 1835626086, 1836019574, 1836476516, 1936549988, 1937007212, 1937011556, 1937011578, 1937011827, 1953196132, 1953653099};

    /* renamed from: u */
    public static final int[] f8500u = {1684631142, 1751411826, 1835296868, 1836476516, 1936549988, 1953196132, 1937011556};

    /* renamed from: g */
    private int f8501g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int[] f8502h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int[] f8503i;

    /* renamed from: j */
    private int[] f8504j;

    /* renamed from: k */
    private int f8505k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public HashMap<Integer, C2431c> f8506l;

    /* renamed from: m */
    private int f8507m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f8508n;

    /* renamed from: o */
    private int f8509o;

    /* renamed from: p */
    private int f8510p;

    /* renamed from: q */
    private int f8511q;

    /* renamed from: r */
    private int f8512r;

    /* renamed from: s */
    private int f8513s;

    /* renamed from: com.coocent.musiccutter.ringtone.a$a */
    /* compiled from: CheapAAC */
    static class C2429a implements C2438d.C2439a {
        C2429a() {
        }

        /* renamed from: b */
        public String[] mo9483b() {
            return new String[]{"aac", "m4a"};
        }

        /* renamed from: c */
        public C2438d mo9484c(Application application) {
            return new C2428a();
        }
    }

    /* renamed from: com.coocent.musiccutter.ringtone.a$b */
    /* compiled from: CheapAAC */
    class C2430b implements C4495b.C4496a {

        /* renamed from: a */
        final /* synthetic */ int f8514a;

        /* renamed from: b */
        final /* synthetic */ int f8515b;

        /* renamed from: c */
        final /* synthetic */ InputStream f8516c;

        /* renamed from: d */
        final /* synthetic */ C2438d.C2441c f8517d;

        C2430b(int i, int i2, InputStream inputStream, C2438d.C2441c cVar) {
            this.f8514a = i;
            this.f8515b = i2;
            this.f8516c = inputStream;
            this.f8517d = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0518, code lost:
            if (android.os.Build.VERSION.SDK_INT < 29) goto L_0x0523;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x051a, code lost:
            p159f.p166c.p199f.p200h.C4495b.m19707f(com.coocent.musiccutter.ringtone.C2438d.f8563d, android.net.Uri.parse(r25));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0523, code lost:
            r1.f8517d.mo9412b(r25);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            r24.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            r1.f8517d.mo9411a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            r24.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x053d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            r24.close();
            r1.f8516c.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0546, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0533 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo9485a(java.io.OutputStream r24, java.lang.String r25) {
            /*
                r23 = this;
                r1 = r23
                r2 = r24
                int r0 = r1.f8514a
                if (r0 != 0) goto L_0x000a
                r0 = 20
            L_0x000a:
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r4 = 1718909296(0x66747970, float:2.8862439E23)
                r5 = 24
                byte[] r6 = new byte[r5]
                r6 = {77, 52, 65, 32, 0, 0, 0, 0, 77, 52, 65, 32, 109, 112, 52, 50, 105, 115, 111, 109, 0, 0, 0, 0} // fill-array
                r3.mo9478t(r4, r6)
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r4 = 16
                byte[] r6 = new byte[r4]
                r7 = 0
                r6[r7] = r7
                r8 = 1
                r6[r8] = r7
                r9 = 2
                r6[r9] = r7
                r10 = 3
                r6[r10] = r7
                r11 = 4
                r6[r11] = r7
                r12 = 5
                r6[r12] = r7
                r13 = 6
                r6[r13] = r7
                r14 = 7
                r6[r14] = r8
                int r15 = r1.f8515b
                int r14 = r15 >> 24
                r14 = r14 & 255(0xff, float:3.57E-43)
                byte r14 = (byte) r14
                r17 = 8
                r6[r17] = r14
                int r14 = r15 >> 16
                r14 = r14 & 255(0xff, float:3.57E-43)
                byte r14 = (byte) r14
                r18 = 9
                r6[r18] = r14
                int r14 = r15 >> 8
                r14 = r14 & 255(0xff, float:3.57E-43)
                byte r14 = (byte) r14
                r19 = 10
                r6[r19] = r14
                r14 = r15 & 255(0xff, float:3.57E-43)
                byte r14 = (byte) r14
                r15 = 11
                r6[r15] = r14
                int r14 = r3.f8508n
                int r14 = r14 >> r5
                r14 = r14 & 255(0xff, float:3.57E-43)
                byte r14 = (byte) r14
                r5 = 12
                r6[r5] = r14
                com.coocent.musiccutter.ringtone.a r14 = com.coocent.musiccutter.ringtone.C2428a.this
                int r14 = r14.f8508n
                int r14 = r14 >> r4
                r14 = r14 & 255(0xff, float:3.57E-43)
                byte r14 = (byte) r14
                r20 = 13
                r6[r20] = r14
                com.coocent.musiccutter.ringtone.a r14 = com.coocent.musiccutter.ringtone.C2428a.this
                int r14 = r14.f8508n
                int r14 = r14 >> 8
                r14 = r14 & 255(0xff, float:3.57E-43)
                byte r14 = (byte) r14
                r21 = 14
                r6[r21] = r14
                com.coocent.musiccutter.ringtone.a r14 = com.coocent.musiccutter.ringtone.C2428a.this
                int r14 = r14.f8508n
                r14 = r14 & 255(0xff, float:3.57E-43)
                byte r14 = (byte) r14
                r22 = 15
                r6[r22] = r14
                r14 = 1937011827(0x73747473, float:1.9367711E31)
                r3.mo9478t(r14, r6)
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r6 = 20
                byte[] r6 = new byte[r6]
                r6[r7] = r7
                r6[r8] = r7
                r6[r9] = r7
                r6[r10] = r7
                r6[r11] = r7
                r6[r12] = r7
                r6[r13] = r7
                r16 = 7
                r6[r16] = r8
                r6[r17] = r7
                r6[r18] = r7
                r6[r19] = r7
                r6[r15] = r8
                int r14 = r1.f8515b
                int r13 = r14 >> 24
                r13 = r13 & 255(0xff, float:3.57E-43)
                byte r13 = (byte) r13
                r6[r5] = r13
                int r13 = r14 >> 16
                r13 = r13 & 255(0xff, float:3.57E-43)
                byte r13 = (byte) r13
                r6[r20] = r13
                int r13 = r14 >> 8
                r13 = r13 & 255(0xff, float:3.57E-43)
                byte r13 = (byte) r13
                r6[r21] = r13
                r13 = r14 & 255(0xff, float:3.57E-43)
                byte r13 = (byte) r13
                r6[r22] = r13
                r6[r4] = r7
                r13 = 17
                r6[r13] = r7
                r13 = 18
                r6[r13] = r7
                r13 = 19
                r6[r13] = r8
                r13 = 1937011555(0x73747363, float:1.9367382E31)
                r3.mo9478t(r13, r6)
                int r3 = r1.f8515b
                int r6 = r3 * 4
                int r6 = r6 + r5
                byte[] r6 = new byte[r6]
                int r14 = r3 >> 24
                r14 = r14 & 255(0xff, float:3.57E-43)
                byte r14 = (byte) r14
                r6[r17] = r14
                int r14 = r3 >> 16
                r14 = r14 & 255(0xff, float:3.57E-43)
                byte r14 = (byte) r14
                r6[r18] = r14
                int r14 = r3 >> 8
                r14 = r14 & 255(0xff, float:3.57E-43)
                byte r14 = (byte) r14
                r6[r19] = r14
                r3 = r3 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3
                r6[r15] = r3
                r3 = 0
            L_0x0109:
                int r14 = r1.f8515b
                if (r3 >= r14) goto L_0x0164
                int r14 = r3 * 4
                int r20 = r14 + 12
                com.coocent.musiccutter.ringtone.a r15 = com.coocent.musiccutter.ringtone.C2428a.this
                int[] r15 = r15.f8503i
                int r12 = r1.f8514a
                int r12 = r12 + r3
                r12 = r15[r12]
                r15 = 24
                int r12 = r12 >> r15
                r12 = r12 & 255(0xff, float:3.57E-43)
                byte r12 = (byte) r12
                r6[r20] = r12
                int r12 = r14 + 13
                com.coocent.musiccutter.ringtone.a r15 = com.coocent.musiccutter.ringtone.C2428a.this
                int[] r15 = r15.f8503i
                int r10 = r1.f8514a
                int r10 = r10 + r3
                r10 = r15[r10]
                int r10 = r10 >> r4
                r10 = r10 & 255(0xff, float:3.57E-43)
                byte r10 = (byte) r10
                r6[r12] = r10
                int r10 = r14 + 14
                com.coocent.musiccutter.ringtone.a r12 = com.coocent.musiccutter.ringtone.C2428a.this
                int[] r12 = r12.f8503i
                int r15 = r1.f8514a
                int r15 = r15 + r3
                r12 = r12[r15]
                int r12 = r12 >> 8
                r12 = r12 & 255(0xff, float:3.57E-43)
                byte r12 = (byte) r12
                r6[r10] = r12
                int r14 = r14 + 15
                com.coocent.musiccutter.ringtone.a r10 = com.coocent.musiccutter.ringtone.C2428a.this
                int[] r10 = r10.f8503i
                int r12 = r1.f8514a
                int r12 = r12 + r3
                r10 = r10[r12]
                r10 = r10 & 255(0xff, float:3.57E-43)
                byte r10 = (byte) r10
                r6[r14] = r10
                int r3 = r3 + 1
                r10 = 3
                r12 = 5
                r15 = 11
                goto L_0x0109
            L_0x0164:
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r4 = 1937011578(0x7374737a, float:1.936741E31)
                r3.mo9478t(r4, r6)
                int r3 = r1.f8515b
                int r3 = r3 * 4
                int r3 = r3 + 144
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r6 = r6.f8506l
                r10 = 1937011556(0x73747364, float:1.9367383E31)
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                java.lang.Object r6 = r6.get(r10)
                com.coocent.musiccutter.ringtone.a$c r6 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r6
                int r6 = r6.f8519a
                int r3 = r3 + r6
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r6 = r6.f8506l
                java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
                java.lang.Object r6 = r6.get(r10)
                com.coocent.musiccutter.ringtone.a$c r6 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r6
                int r6 = r6.f8519a
                int r3 = r3 + r6
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r6 = r6.f8506l
                r10 = 1836476516(0x6d766864, float:4.7662196E27)
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                java.lang.Object r6 = r6.get(r10)
                com.coocent.musiccutter.ringtone.a$c r6 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r6
                int r6 = r6.f8519a
                int r3 = r3 + r6
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r6 = r6.f8506l
                r10 = 1953196132(0x746b6864, float:7.46037E31)
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                java.lang.Object r6 = r6.get(r10)
                com.coocent.musiccutter.ringtone.a$c r6 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r6
                int r6 = r6.f8519a
                int r3 = r3 + r6
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r6 = r6.f8506l
                r10 = 1835296868(0x6d646864, float:4.418049E27)
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                java.lang.Object r6 = r6.get(r10)
                com.coocent.musiccutter.ringtone.a$c r6 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r6
                int r6 = r6.f8519a
                int r3 = r3 + r6
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r6 = r6.f8506l
                r10 = 1751411826(0x68646c72, float:4.3148E24)
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                java.lang.Object r6 = r6.get(r10)
                com.coocent.musiccutter.ringtone.a$c r6 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r6
                int r6 = r6.f8519a
                int r3 = r3 + r6
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r6 = r6.f8506l
                r10 = 1936549988(0x736d6864, float:1.8809382E31)
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                java.lang.Object r6 = r6.get(r10)
                com.coocent.musiccutter.ringtone.a$c r6 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r6
                int r6 = r6.f8519a
                int r3 = r3 + r6
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r6 = r6.f8506l
                r10 = 1684631142(0x64696e66, float:1.7224186E22)
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                java.lang.Object r6 = r6.get(r10)
                com.coocent.musiccutter.ringtone.a$c r6 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r6
                int r6 = r6.f8519a
                int r3 = r3 + r6
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this
                r10 = 1937007471(0x7374636f, float:1.9362445E31)
                byte[] r5 = new byte[r5]
                r5[r7] = r7
                r5[r8] = r7
                r5[r9] = r7
                r9 = 3
                r5[r9] = r7
                r5[r11] = r7
                r9 = 5
                r5[r9] = r7
                r9 = 6
                r5[r9] = r7
                r9 = 7
                r5[r9] = r8
                int r8 = r3 >> 24
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte r8 = (byte) r8
                r5[r17] = r8
                int r8 = r3 >> 16
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte r8 = (byte) r8
                r5[r18] = r8
                int r8 = r3 >> 8
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte r8 = (byte) r8
                r5[r19] = r8
                r3 = r3 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3
                r8 = 11
                r5[r8] = r3
                r6.mo9478t(r10, r5)
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r3 = r3.f8506l
                r5 = 1937007212(0x7374626c, float:1.9362132E31)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r3 = r3.get(r5)
                com.coocent.musiccutter.ringtone.a$c r3 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r3
                com.coocent.musiccutter.ringtone.a r5 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r5 = r5.f8506l
                r6 = 1937011556(0x73747364, float:1.9367383E31)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r5 = r5.get(r6)
                com.coocent.musiccutter.ringtone.a$c r5 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r5
                int r5 = r5.f8519a
                int r5 = r5 + 8
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r6 = r6.f8506l
                r8 = 1937011827(0x73747473, float:1.9367711E31)
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
                java.lang.Object r6 = r6.get(r9)
                com.coocent.musiccutter.ringtone.a$c r6 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r6
                int r6 = r6.f8519a
                int r5 = r5 + r6
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r6 = r6.f8506l
                java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
                java.lang.Object r6 = r6.get(r8)
                com.coocent.musiccutter.ringtone.a$c r6 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r6
                int r6 = r6.f8519a
                int r5 = r5 + r6
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r6 = r6.f8506l
                java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
                java.lang.Object r6 = r6.get(r8)
                com.coocent.musiccutter.ringtone.a$c r6 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r6
                int r6 = r6.f8519a
                int r5 = r5 + r6
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r6 = r6.f8506l
                r8 = 1937007471(0x7374636f, float:1.9362445E31)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.Object r6 = r6.get(r8)
                com.coocent.musiccutter.ringtone.a$c r6 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r6
                int r6 = r6.f8519a
                int r5 = r5 + r6
                r3.f8519a = r5
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r3 = r3.f8506l
                r5 = 1835626086(0x6d696e66, float:4.515217E27)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r3 = r3.get(r5)
                com.coocent.musiccutter.ringtone.a$c r3 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r3
                com.coocent.musiccutter.ringtone.a r5 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r5 = r5.f8506l
                r6 = 1684631142(0x64696e66, float:1.7224186E22)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r5 = r5.get(r6)
                com.coocent.musiccutter.ringtone.a$c r5 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r5
                int r5 = r5.f8519a
                int r5 = r5 + 8
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r6 = r6.f8506l
                r8 = 1936549988(0x736d6864, float:1.8809382E31)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.Object r6 = r6.get(r8)
                com.coocent.musiccutter.ringtone.a$c r6 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r6
                int r6 = r6.f8519a
                int r5 = r5 + r6
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r6 = r6.f8506l
                r8 = 1937007212(0x7374626c, float:1.9362132E31)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.Object r6 = r6.get(r8)
                com.coocent.musiccutter.ringtone.a$c r6 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r6
                int r6 = r6.f8519a
                int r5 = r5 + r6
                r3.f8519a = r5
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r3 = r3.f8506l
                r5 = 1835297121(0x6d646961, float:4.4181236E27)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r3 = r3.get(r5)
                com.coocent.musiccutter.ringtone.a$c r3 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r3
                com.coocent.musiccutter.ringtone.a r5 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r5 = r5.f8506l
                r6 = 1835296868(0x6d646864, float:4.418049E27)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r5 = r5.get(r6)
                com.coocent.musiccutter.ringtone.a$c r5 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r5
                int r5 = r5.f8519a
                int r5 = r5 + 8
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r6 = r6.f8506l
                r8 = 1751411826(0x68646c72, float:4.3148E24)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.Object r6 = r6.get(r8)
                com.coocent.musiccutter.ringtone.a$c r6 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r6
                int r6 = r6.f8519a
                int r5 = r5 + r6
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r6 = r6.f8506l
                r8 = 1835626086(0x6d696e66, float:4.515217E27)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.Object r6 = r6.get(r8)
                com.coocent.musiccutter.ringtone.a$c r6 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r6
                int r6 = r6.f8519a
                int r5 = r5 + r6
                r3.f8519a = r5
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r3 = r3.f8506l
                r5 = 1953653099(0x7472616b, float:7.681346E31)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r3 = r3.get(r5)
                com.coocent.musiccutter.ringtone.a$c r3 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r3
                com.coocent.musiccutter.ringtone.a r5 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r5 = r5.f8506l
                r6 = 1953196132(0x746b6864, float:7.46037E31)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r5 = r5.get(r6)
                com.coocent.musiccutter.ringtone.a$c r5 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r5
                int r5 = r5.f8519a
                int r5 = r5 + 8
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r6 = r6.f8506l
                r8 = 1835297121(0x6d646961, float:4.4181236E27)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.Object r6 = r6.get(r8)
                com.coocent.musiccutter.ringtone.a$c r6 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r6
                int r6 = r6.f8519a
                int r5 = r5 + r6
                r3.f8519a = r5
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r3 = r3.f8506l
                r5 = 1836019574(0x6d6f6f76, float:4.631354E27)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r3 = r3.get(r5)
                com.coocent.musiccutter.ringtone.a$c r3 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r3
                com.coocent.musiccutter.ringtone.a r5 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r5 = r5.f8506l
                r6 = 1836476516(0x6d766864, float:4.7662196E27)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r5 = r5.get(r6)
                com.coocent.musiccutter.ringtone.a$c r5 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r5
                int r5 = r5.f8519a
                int r5 = r5 + 8
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r6 = r6.f8506l
                r8 = 1953653099(0x7472616b, float:7.681346E31)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.Object r6 = r6.get(r8)
                com.coocent.musiccutter.ringtone.a$c r6 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r6
                int r6 = r6.f8519a
                int r5 = r5 + r6
                r3.f8519a = r5
                r3 = 8
                r5 = 0
            L_0x040e:
                int r6 = r1.f8515b
                if (r5 >= r6) goto L_0x0421
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this
                int[] r6 = r6.f8503i
                int r8 = r1.f8514a
                int r8 = r8 + r5
                r6 = r6[r8]
                int r3 = r3 + r6
                int r5 = r5 + 1
                goto L_0x040e
            L_0x0421:
                com.coocent.musiccutter.ringtone.a r5 = com.coocent.musiccutter.ringtone.C2428a.this
                java.util.HashMap r5 = r5.f8506l
                r6 = 1835295092(0x6d646174, float:4.4175247E27)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r5 = r5.get(r6)
                com.coocent.musiccutter.ringtone.a$c r5 = (com.coocent.musiccutter.ringtone.C2428a.C2431c) r5
                r5.f8519a = r3
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r5 = 1718909296(0x66747970, float:2.8862439E23)
                r3.mo9482x(r2, r5)
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r5 = 1836019574(0x6d6f6f76, float:4.631354E27)
                r3.mo9480v(r2, r5)
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r5 = 1836476516(0x6d766864, float:4.7662196E27)
                r3.mo9482x(r2, r5)
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r5 = 1953653099(0x7472616b, float:7.681346E31)
                r3.mo9480v(r2, r5)
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r5 = 1953196132(0x746b6864, float:7.46037E31)
                r3.mo9482x(r2, r5)
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r5 = 1835297121(0x6d646961, float:4.4181236E27)
                r3.mo9480v(r2, r5)
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r5 = 1835296868(0x6d646864, float:4.418049E27)
                r3.mo9482x(r2, r5)
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r5 = 1751411826(0x68646c72, float:4.3148E24)
                r3.mo9482x(r2, r5)
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r5 = 1835626086(0x6d696e66, float:4.515217E27)
                r3.mo9480v(r2, r5)
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r5 = 1684631142(0x64696e66, float:1.7224186E22)
                r3.mo9482x(r2, r5)
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r5 = 1936549988(0x736d6864, float:1.8809382E31)
                r3.mo9482x(r2, r5)
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r5 = 1937007212(0x7374626c, float:1.9362132E31)
                r3.mo9480v(r2, r5)
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r5 = 1937011556(0x73747364, float:1.9367383E31)
                r3.mo9482x(r2, r5)
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r5 = 1937011827(0x73747473, float:1.9367711E31)
                r3.mo9482x(r2, r5)
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r3.mo9482x(r2, r13)
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r3.mo9482x(r2, r4)
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r4 = 1937007471(0x7374636f, float:1.9362445E31)
                r3.mo9482x(r2, r4)
                com.coocent.musiccutter.ringtone.a r3 = com.coocent.musiccutter.ringtone.C2428a.this
                r4 = 1835295092(0x6d646174, float:4.4175247E27)
                r3.mo9480v(r2, r4)
                r3 = 0
                r4 = 0
            L_0x04c2:
                int r5 = r1.f8515b
                if (r3 >= r5) goto L_0x04e1
                com.coocent.musiccutter.ringtone.a r5 = com.coocent.musiccutter.ringtone.C2428a.this
                int[] r5 = r5.f8503i
                int r6 = r1.f8514a
                int r6 = r6 + r3
                r5 = r5[r6]
                if (r5 <= r4) goto L_0x04de
                com.coocent.musiccutter.ringtone.a r4 = com.coocent.musiccutter.ringtone.C2428a.this
                int[] r4 = r4.f8503i
                int r5 = r1.f8514a
                int r5 = r5 + r3
                r4 = r4[r5]
            L_0x04de:
                int r3 = r3 + 1
                goto L_0x04c2
            L_0x04e1:
                byte[] r3 = new byte[r4]
                r4 = 0
                r5 = 0
            L_0x04e5:
                int r6 = r1.f8515b     // Catch:{ all -> 0x0533 }
                if (r4 >= r6) goto L_0x0514
                com.coocent.musiccutter.ringtone.a r6 = com.coocent.musiccutter.ringtone.C2428a.this     // Catch:{ all -> 0x0533 }
                int[] r6 = r6.f8502h     // Catch:{ all -> 0x0533 }
                int r8 = r0 + r4
                r6 = r6[r8]     // Catch:{ all -> 0x0533 }
                int r6 = r6 - r5
                com.coocent.musiccutter.ringtone.a r9 = com.coocent.musiccutter.ringtone.C2428a.this     // Catch:{ all -> 0x0533 }
                int[] r9 = r9.f8503i     // Catch:{ all -> 0x0533 }
                r8 = r9[r8]     // Catch:{ all -> 0x0533 }
                if (r6 >= 0) goto L_0x04ff
                goto L_0x0511
            L_0x04ff:
                if (r6 <= 0) goto L_0x0508
                java.io.InputStream r9 = r1.f8516c     // Catch:{ all -> 0x0533 }
                long r10 = (long) r6     // Catch:{ all -> 0x0533 }
                r9.skip(r10)     // Catch:{ all -> 0x0533 }
                int r5 = r5 + r6
            L_0x0508:
                java.io.InputStream r6 = r1.f8516c     // Catch:{ all -> 0x0533 }
                r6.read(r3, r7, r8)     // Catch:{ all -> 0x0533 }
                r2.write(r3, r7, r8)     // Catch:{ all -> 0x0533 }
                int r5 = r5 + r8
            L_0x0511:
                int r4 = r4 + 1
                goto L_0x04e5
            L_0x0514:
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0533 }
                r3 = 29
                if (r0 < r3) goto L_0x0523
                android.app.Application r0 = com.coocent.musiccutter.ringtone.C2438d.f8563d     // Catch:{ all -> 0x0533 }
                android.net.Uri r3 = android.net.Uri.parse(r25)     // Catch:{ all -> 0x0533 }
                p159f.p166c.p199f.p200h.C4495b.m19707f(r0, r3)     // Catch:{ all -> 0x0533 }
            L_0x0523:
                com.coocent.musiccutter.ringtone.d$c r0 = r1.f8517d     // Catch:{ all -> 0x0533 }
                r3 = r25
                r0.mo9412b(r3)     // Catch:{ all -> 0x0533 }
                r24.close()     // Catch:{ IOException -> 0x053c }
            L_0x052d:
                java.io.InputStream r0 = r1.f8516c     // Catch:{ IOException -> 0x053c }
                r0.close()     // Catch:{ IOException -> 0x053c }
                goto L_0x053c
            L_0x0533:
                com.coocent.musiccutter.ringtone.d$c r0 = r1.f8517d     // Catch:{ all -> 0x053d }
                r0.mo9411a()     // Catch:{ all -> 0x053d }
                r24.close()     // Catch:{ IOException -> 0x053c }
                goto L_0x052d
            L_0x053c:
                return
            L_0x053d:
                r0 = move-exception
                r24.close()     // Catch:{ IOException -> 0x0546 }
                java.io.InputStream r2 = r1.f8516c     // Catch:{ IOException -> 0x0546 }
                r2.close()     // Catch:{ IOException -> 0x0546 }
            L_0x0546:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.coocent.musiccutter.ringtone.C2428a.C2430b.mo9485a(java.io.OutputStream, java.lang.String):void");
        }

        /* renamed from: b */
        public void mo9486b() {
            this.f8517d.mo9411a();
            try {
                this.f8516c.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: com.coocent.musiccutter.ringtone.a$c */
    /* compiled from: CheapAAC */
    class C2431c {

        /* renamed from: a */
        public int f8519a;

        /* renamed from: b */
        public byte[] f8520b;

        C2431c(C2428a aVar) {
        }
    }

    /* renamed from: D */
    public static C2438d.C2439a m11346D() {
        return new C2429a();
    }

    /* renamed from: F */
    private void m11347F(InputStream inputStream, int i) throws IOException {
        while (i > 8) {
            int i2 = this.f8509o;
            byte[] bArr = new byte[8];
            inputStream.read(bArr, 0, 8);
            byte b = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            if (b > i) {
                b = i;
            }
            byte b2 = (bArr[7] & 255) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8);
            C2431c cVar = new C2431c(this);
            cVar.f8519a = b;
            this.f8506l.put(Integer.valueOf(b2), cVar);
            int i3 = this.f8509o + 8;
            this.f8509o = i3;
            if (b2 == 1836019574 || b2 == 1953653099 || b2 == 1835297121 || b2 == 1835626086 || b2 == 1937007212) {
                m11347F(inputStream, b);
            } else if (b2 == 1937011578) {
                mo9464H(inputStream, b - 8);
            } else if (b2 == 1937011827) {
                mo9465I(inputStream, b - 8);
            } else if (b2 == 1835295092) {
                this.f8512r = i3;
                this.f8513s = b - 8;
            } else {
                for (int i4 : f8500u) {
                    if (i4 == b2) {
                        int i5 = b - 8;
                        byte[] bArr2 = new byte[i5];
                        inputStream.read(bArr2, 0, i5);
                        this.f8509o += i5;
                        this.f8506l.get(Integer.valueOf(b2)).f8520b = bArr2;
                    }
                }
            }
            if (b2 == 1937011556) {
                mo9463G();
            }
            i -= b;
            int i6 = b - (this.f8509o - i2);
            if (i6 >= 0) {
                inputStream.skip((long) i6);
                this.f8509o += i6;
            } else {
                throw new IOException("Went over by " + (-i6) + " bytes");
            }
        }
    }

    /* renamed from: C */
    public String mo9461C(int i) {
        return (((BuildConfig.FLAVOR + ((char) ((i >> 24) & 255))) + ((char) ((i >> 16) & 255))) + ((char) ((i >> 8) & 255))) + ((char) (i & 255));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo9462E(InputStream inputStream, int i) throws IOException {
        int i2 = this.f8509o;
        int i3 = 0;
        while (i3 < this.f8501g) {
            int[] iArr = this.f8502h;
            int i4 = this.f8509o;
            iArr[i3] = i4;
            if ((i4 - i2) + this.f8503i[i3] > i - 8) {
                this.f8504j[i3] = 0;
            } else {
                mo9466J(inputStream, i3);
            }
            int[] iArr2 = this.f8504j;
            if (iArr2[i3] < this.f8510p) {
                this.f8510p = iArr2[i3];
            }
            if (iArr2[i3] > this.f8511q) {
                this.f8511q = iArr2[i3];
            }
            C2438d.C2440b bVar = this.f8566a;
            if (bVar == null || bVar.mo9404a((((double) this.f8509o) * 1.0d) / ((double) this.f8505k))) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo9463G() {
        byte[] bArr = this.f8506l.get(1937011556).f8520b;
        byte b = bArr[32];
        byte b2 = bArr[33];
        this.f8507m = (bArr[41] & 255) | ((bArr[40] & 255) << 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo9464H(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[12];
        inputStream.read(bArr, 0, 12);
        this.f8509o += 12;
        int i2 = (bArr[11] & 255) | ((bArr[8] & 255) << 24) | ((bArr[9] & 255) << 16) | ((bArr[10] & 255) << 8);
        this.f8501g = i2;
        this.f8502h = new int[i2];
        this.f8503i = new int[i2];
        this.f8504j = new int[i2];
        byte[] bArr2 = new byte[(i2 * 4)];
        inputStream.read(bArr2, 0, i2 * 4);
        this.f8509o += this.f8501g * 4;
        for (int i3 = 0; i3 < this.f8501g; i3++) {
            int i4 = i3 * 4;
            this.f8503i[i3] = (bArr2[i4 + 3] & 255) | ((bArr2[i4 + 0] & 255) << 24) | ((bArr2[i4 + 1] & 255) << 16) | ((bArr2[i4 + 2] & 255) << 8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo9465I(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[16];
        inputStream.read(bArr, 0, 16);
        this.f8509o += 16;
        this.f8508n = ((bArr[12] & 255) << 24) | ((bArr[13] & 255) << 16) | ((bArr[14] & 255) << 8) | (bArr[15] & 255);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo9466J(InputStream inputStream, int i) throws IOException {
        int i2;
        int i3;
        int i4;
        byte b;
        InputStream inputStream2 = inputStream;
        int[] iArr = this.f8503i;
        if (iArr[i] < 4) {
            this.f8504j[i] = 0;
            inputStream2.skip((long) iArr[i]);
            return;
        }
        int i5 = this.f8509o;
        byte[] bArr = new byte[4];
        inputStream2.read(bArr, 0, 4);
        this.f8509o += 4;
        int i6 = (bArr[0] & 224) >> 5;
        if (i6 == 0) {
            this.f8504j[i] = ((bArr[1] & 254) >> 1) | ((bArr[0] & 1) << 7);
        } else if (i6 != 1) {
            this.f8504j[i] = 0;
        } else {
            int i7 = (bArr[1] & 96) >> 5;
            byte b2 = bArr[1];
            if (i7 == 2) {
                b = bArr[1] & 15;
                i4 = (bArr[2] & 254) >> 1;
                i3 = ((bArr[2] & 1) << 1) | ((bArr[3] & 128) >> 7);
                i2 = 25;
            } else {
                b = ((bArr[1] & 15) << 2) | ((bArr[2] & 192) >> 6);
                i4 = -1;
                i3 = (bArr[2] & 24) >> 3;
                i2 = 21;
            }
            if (i3 == 1) {
                int i8 = 0;
                for (int i9 = 0; i9 < 7; i9++) {
                    if (((1 << i9) & i4) == 0) {
                        i8++;
                    }
                }
                i2 += b * (i8 + 1);
            }
            int i10 = ((i2 + 7) / 8) + 1;
            byte[] bArr2 = new byte[i10];
            bArr2[0] = bArr[0];
            bArr2[1] = bArr[1];
            bArr2[2] = bArr[2];
            bArr2[3] = bArr[3];
            int i11 = i10 - 4;
            inputStream2.read(bArr2, 4, i11);
            this.f8509o += i11;
            int i12 = 0;
            for (int i13 = 0; i13 < 8; i13++) {
                int i14 = i13 + i2;
                int i15 = i14 / 8;
                int i16 = 7 - (i14 % 8);
                i12 += ((bArr2[i15] & (1 << i16)) >> i16) << (7 - i13);
            }
            this.f8504j[i] = i12;
        }
        int i17 = this.f8503i[i] - (this.f8509o - i5);
        inputStream2.skip((long) i17);
        this.f8509o += i17;
    }

    /* renamed from: a */
    public void mo9467a(File file) throws FileNotFoundException, IOException {
        super.mo9467a(file);
        this.f8507m = 0;
        this.f8508n = 0;
        this.f8501g = 0;
        this.f8510p = 255;
        this.f8511q = 0;
        this.f8509o = 0;
        this.f8512r = -1;
        this.f8513s = -1;
        this.f8506l = new HashMap<>();
        int length = (int) this.f8567b.length();
        this.f8505k = length;
        if (length >= 128) {
            byte[] bArr = new byte[8];
            new FileInputStream(this.f8567b).read(bArr, 0, 8);
            if (bArr[0] == 0 && bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) {
                m11347F(new FileInputStream(this.f8567b), this.f8505k);
                if (this.f8512r <= 0 || this.f8513s <= 0) {
                    throw new IOException("Didn't find mdat");
                }
                FileInputStream fileInputStream = new FileInputStream(this.f8567b);
                fileInputStream.skip((long) this.f8512r);
                this.f8509o = this.f8512r;
                mo9462E(fileInputStream, this.f8513s);
                boolean z = false;
                for (int i : f8499t) {
                    if (!this.f8506l.containsKey(Integer.valueOf(i))) {
                        System.out.println("Missing atom: " + mo9461C(i));
                        z = true;
                    }
                }
                if (!z) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    throw new IOException("Could not parse MP4 file");
                }
            } else {
                throw new IOException("Unknown file format");
            }
        } else {
            throw new IOException("File too small to parse");
        }
    }

    /* renamed from: b */
    public void mo9468b(File file, int i, int i2) throws IOException {
        int i3 = i2;
        int i4 = i == 0 ? 20 : i;
        file.createNewFile();
        FileInputStream fileInputStream = new FileInputStream(this.f8567b);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        mo9478t(1718909296, new byte[]{77, 52, 65, 32, 0, 0, 0, 0, 77, 52, 65, 32, 109, 112, 52, 50, 105, 115, 111, 109, 0, 0, 0, 0});
        byte b = (byte) ((i3 >> 24) & 255);
        byte b2 = (byte) ((i3 >> 16) & 255);
        byte b3 = (byte) ((i3 >> 8) & 255);
        byte b4 = (byte) (i3 & 255);
        int i5 = this.f8508n;
        mo9478t(1937011827, new byte[]{0, 0, 0, 0, 0, 0, 0, 1, b, b2, b3, b4, (byte) ((i5 >> 24) & 255), (byte) ((i5 >> 16) & 255), (byte) ((i5 >> 8) & 255), (byte) (i5 & 255)});
        mo9478t(1937011555, new byte[]{0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, b, b2, b3, b4, 0, 0, 0, 1});
        int i6 = i3 * 4;
        byte[] bArr = new byte[(i6 + 12)];
        bArr[8] = b;
        bArr[9] = b2;
        bArr[10] = b3;
        bArr[11] = b4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = i7 * 4;
            int[] iArr = this.f8503i;
            int i9 = i4 + i7;
            bArr[i8 + 12] = (byte) ((iArr[i9] >> 24) & 255);
            bArr[i8 + 13] = (byte) ((iArr[i9] >> 16) & 255);
            bArr[i8 + 14] = (byte) ((iArr[i9] >> 8) & 255);
            bArr[i8 + 15] = (byte) (iArr[i9] & 255);
        }
        mo9478t(1937011578, bArr);
        int i10 = i6 + 144 + this.f8506l.get(1937011556).f8519a + this.f8506l.get(1937011555).f8519a + this.f8506l.get(1836476516).f8519a + this.f8506l.get(1953196132).f8519a + this.f8506l.get(1835296868).f8519a + this.f8506l.get(1751411826).f8519a + this.f8506l.get(1936549988).f8519a + this.f8506l.get(1684631142).f8519a;
        mo9478t(1937007471, new byte[]{0, 0, 0, 0, 0, 0, 0, 1, (byte) ((i10 >> 24) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 8) & 255), (byte) (i10 & 255)});
        this.f8506l.get(1937007212).f8519a = this.f8506l.get(1937011556).f8519a + 8 + this.f8506l.get(1937011827).f8519a + this.f8506l.get(1937011555).f8519a + this.f8506l.get(1937011578).f8519a + this.f8506l.get(1937007471).f8519a;
        this.f8506l.get(1835626086).f8519a = this.f8506l.get(1684631142).f8519a + 8 + this.f8506l.get(1936549988).f8519a + this.f8506l.get(1937007212).f8519a;
        this.f8506l.get(1835297121).f8519a = this.f8506l.get(1835296868).f8519a + 8 + this.f8506l.get(1751411826).f8519a + this.f8506l.get(1835626086).f8519a;
        this.f8506l.get(1953653099).f8519a = this.f8506l.get(1953196132).f8519a + 8 + this.f8506l.get(1835297121).f8519a;
        this.f8506l.get(1836019574).f8519a = this.f8506l.get(1836476516).f8519a + 8 + this.f8506l.get(1953653099).f8519a;
        int i11 = 8;
        for (int i12 = 0; i12 < i3; i12++) {
            i11 += this.f8503i[i4 + i12];
        }
        this.f8506l.get(1835295092).f8519a = i11;
        mo9481w(fileOutputStream, 1718909296);
        mo9479u(fileOutputStream, 1836019574);
        mo9481w(fileOutputStream, 1836476516);
        mo9479u(fileOutputStream, 1953653099);
        mo9481w(fileOutputStream, 1953196132);
        mo9479u(fileOutputStream, 1835297121);
        mo9481w(fileOutputStream, 1835296868);
        mo9481w(fileOutputStream, 1751411826);
        mo9479u(fileOutputStream, 1835626086);
        mo9481w(fileOutputStream, 1684631142);
        mo9481w(fileOutputStream, 1936549988);
        mo9479u(fileOutputStream, 1937007212);
        mo9481w(fileOutputStream, 1937011556);
        mo9481w(fileOutputStream, 1937011827);
        mo9481w(fileOutputStream, 1937011555);
        mo9481w(fileOutputStream, 1937011578);
        mo9481w(fileOutputStream, 1937007471);
        mo9479u(fileOutputStream, 1835295092);
        int i13 = 0;
        for (int i14 = 0; i14 < i3; i14++) {
            int[] iArr2 = this.f8503i;
            int i15 = i4 + i14;
            if (iArr2[i15] > i13) {
                i13 = iArr2[i15];
            }
        }
        byte[] bArr2 = new byte[i13];
        int i16 = 0;
        for (int i17 = 0; i17 < i3; i17++) {
            int i18 = i4 + i17;
            int i19 = this.f8502h[i18] - i16;
            int i20 = this.f8503i[i18];
            if (i19 >= 0) {
                if (i19 > 0) {
                    fileInputStream.skip((long) i19);
                    i16 += i19;
                }
                fileInputStream.read(bArr2, 0, i20);
                fileOutputStream.write(bArr2, 0, i20);
                i16 += i20;
            }
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    /* renamed from: c */
    public void mo9469c(CharSequence charSequence, String str, long j, int i, int i2, int i3, C2438d.C2441c cVar) throws IOException {
        if (!TextUtils.isEmpty(charSequence)) {
            C4495b.m19705d(C2438d.f8563d, i, charSequence.toString(), str, new C2430b(i2, i3, C4495b.m19704c(C2438d.f8563d, j), cVar));
        }
    }

    /* renamed from: g */
    public int mo9470g() {
        try {
            return this.f8505k / (this.f8501g * this.f8508n);
        } catch (ArithmeticException unused) {
            return 0;
        }
    }

    /* renamed from: h */
    public String mo9471h() {
        return "AAC";
    }

    /* renamed from: i */
    public int[] mo9472i() {
        return this.f8504j;
    }

    /* renamed from: j */
    public int[] mo9473j() {
        return this.f8503i;
    }

    /* renamed from: k */
    public int[] mo9474k() {
        return this.f8502h;
    }

    /* renamed from: l */
    public int mo9475l() {
        return this.f8501g;
    }

    /* renamed from: m */
    public int mo9476m() {
        return this.f8507m;
    }

    /* renamed from: n */
    public int mo9477n() {
        return this.f8508n;
    }

    /* renamed from: t */
    public void mo9478t(int i, byte[] bArr) {
        C2431c cVar = this.f8506l.get(Integer.valueOf(i));
        if (cVar == null) {
            cVar = new C2431c(this);
            this.f8506l.put(Integer.valueOf(i), cVar);
        }
        cVar.f8519a = bArr.length + 8;
        cVar.f8520b = bArr;
    }

    /* renamed from: u */
    public void mo9479u(FileOutputStream fileOutputStream, int i) throws IOException {
        int i2 = this.f8506l.get(Integer.valueOf(i)).f8519a;
        fileOutputStream.write(new byte[]{(byte) ((i2 >> 24) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255), (byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)}, 0, 8);
    }

    /* renamed from: v */
    public void mo9480v(OutputStream outputStream, int i) {
        int i2 = this.f8506l.get(Integer.valueOf(i)).f8519a;
        try {
            outputStream.write(new byte[]{(byte) ((i2 >> 24) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255), (byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)}, 0, 8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: w */
    public void mo9481w(FileOutputStream fileOutputStream, int i) throws IOException {
        C2431c cVar = this.f8506l.get(Integer.valueOf(i));
        mo9479u(fileOutputStream, i);
        fileOutputStream.write(cVar.f8520b, 0, cVar.f8519a - 8);
    }

    /* renamed from: x */
    public void mo9482x(OutputStream outputStream, int i) {
        C2431c cVar = this.f8506l.get(Integer.valueOf(i));
        mo9480v(outputStream, i);
        try {
            outputStream.write(cVar.f8520b, 0, cVar.f8519a - 8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

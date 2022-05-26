package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class v44 extends z44 {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final u53<Integer> f24579e = u53.zzb(i44.f17885g);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final u53<Integer> f24580f = u53.zzb(j44.f18363g);

    /* renamed from: g */
    public static final /* synthetic */ int f24581g = 0;

    /* renamed from: c */
    private final AtomicReference<o44> f24582c;

    /* renamed from: d */
    private final e44 f24583d;

    public v44(Context context) {
        e44 e44 = new e44();
        o44 c = o44.m28286c(context);
        this.f24583d = e44;
        this.f24582c = new AtomicReference<>(c);
    }

    /* renamed from: g */
    protected static int m32155g(C5689w wVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(wVar.f25124c)) {
            return 4;
        }
        String k = m32158k(str);
        String k2 = m32158k(wVar.f25124c);
        if (k2 == null || k == null) {
            if (!z || k2 != null) {
                return 0;
            }
            return 1;
        } else if (k2.startsWith(k) || k.startsWith(k2)) {
            return 3;
        } else {
            if (wy2.m33410E(k2, "-")[0].equals(wy2.m33410E(k, "-")[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* renamed from: k */
    protected static String m32158k(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: m */
    protected static boolean m32159m(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: com.google.android.gms.internal.ads.h44[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: com.google.android.gms.internal.ads.f44} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v45, resolved type: com.google.android.gms.internal.ads.x44} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v9, resolved type: com.google.android.gms.internal.ads.x44} */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d3  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.google.android.gms.internal.ads.nu3[], com.google.android.gms.internal.ads.h44[]> mo21424f(com.google.android.gms.internal.ads.y44 r28, int[][][] r29, int[] r30, com.google.android.gms.internal.ads.f24 r31, com.google.android.gms.internal.ads.bg0 r32) throws com.google.android.gms.internal.ads.ji3 {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.o44> r2 = r0.f24582c
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.o44 r2 = (com.google.android.gms.internal.ads.o44) r2
            r3 = 2
            com.google.android.gms.internal.ads.w44[] r4 = new com.google.android.gms.internal.ads.w44[r3]
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0012:
            r11 = 1
            if (r6 >= r3) goto L_0x01e8
            int r12 = r1.mo22166a(r6)
            if (r12 != r3) goto L_0x01d8
            if (r7 != 0) goto L_0x01c3
            com.google.android.gms.internal.ads.uj0 r7 = r1.mo22168c(r6)
            r12 = r29[r6]
            r13 = r30[r6]
            boolean r13 = r2.f26487v
            boolean r13 = r2.f26486u
            boolean r13 = r2.f20910C
            boolean r13 = r2.f20909B
            r13 = 0
        L_0x002e:
            int r14 = r7.f24343a
            if (r13 >= r14) goto L_0x0053
            com.google.android.gms.internal.ads.xh0 r14 = r7.mo21275b(r13)
            r15 = r12[r13]
            int r15 = r2.f26466a
            int r15 = r2.f26467b
            int r15 = r2.f26468c
            int r15 = r2.f26469d
            int r15 = r2.f26470e
            int r15 = r2.f26471f
            int r15 = r2.f26472g
            int r15 = r2.f26473h
            int r15 = r2.f26474i
            int r15 = r2.f26475j
            boolean r15 = r2.f26476k
            int r14 = r14.f25828a
            int r13 = r13 + 1
            goto L_0x002e
        L_0x0053:
            r13 = 0
            r14 = 0
            r15 = -1
            r16 = 0
        L_0x0058:
            int r10 = r7.f24343a
            if (r13 >= r10) goto L_0x019e
            com.google.android.gms.internal.ads.xh0 r10 = r7.mo21275b(r13)
            int r3 = r2.f26474i
            int r5 = r2.f26475j
            boolean r9 = r2.f26476k
            r17 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            int r0 = r10.f25828a
            r7.<init>(r11)
            r0 = 0
        L_0x0070:
            int r11 = r10.f25828a
            if (r0 > 0) goto L_0x007e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r7.add(r11)
            int r0 = r0 + 1
            goto L_0x0070
        L_0x007e:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r0) goto L_0x0145
            if (r5 != r0) goto L_0x0087
            goto L_0x0145
        L_0x0087:
            r19 = r8
            r11 = 0
        L_0x008a:
            int r8 = r10.f25828a
            if (r11 > 0) goto L_0x0117
            com.google.android.gms.internal.ads.w r8 = r10.mo22031b(r11)
            int r1 = r8.f25138q
            if (r1 <= 0) goto L_0x00fd
            r20 = r4
            int r4 = r8.f25139r
            if (r4 <= 0) goto L_0x00fa
            if (r9 == 0) goto L_0x00b8
            if (r1 > r4) goto L_0x00a4
            r21 = r9
            r9 = 0
            goto L_0x00a7
        L_0x00a4:
            r21 = r9
            r9 = 1
        L_0x00a7:
            if (r3 > r5) goto L_0x00ad
            r22 = r3
            r3 = 0
            goto L_0x00b0
        L_0x00ad:
            r22 = r3
            r3 = 1
        L_0x00b0:
            if (r9 == r3) goto L_0x00bc
            r9 = r5
            r23 = r9
            r3 = r22
            goto L_0x00c1
        L_0x00b8:
            r22 = r3
            r21 = r9
        L_0x00bc:
            r3 = r5
            r23 = r3
            r9 = r22
        L_0x00c1:
            int r5 = r1 * r3
            r24 = r6
            int r6 = r4 * r9
            if (r5 < r6) goto L_0x00d3
            android.graphics.Point r3 = new android.graphics.Point
            int r1 = com.google.android.gms.internal.ads.wy2.m33416K(r6, r1)
            r3.<init>(r9, r1)
            goto L_0x00dd
        L_0x00d3:
            android.graphics.Point r1 = new android.graphics.Point
            int r4 = com.google.android.gms.internal.ads.wy2.m33416K(r5, r4)
            r1.<init>(r4, r3)
            r3 = r1
        L_0x00dd:
            int r1 = r8.f25138q
            int r4 = r8.f25139r
            int r5 = r1 * r4
            int r6 = r3.x
            float r6 = (float) r6
            r8 = 1065017672(0x3f7ae148, float:0.98)
            float r6 = r6 * r8
            int r6 = (int) r6
            if (r1 < r6) goto L_0x0107
            int r1 = r3.y
            float r1 = (float) r1
            float r1 = r1 * r8
            int r1 = (int) r1
            if (r4 < r1) goto L_0x0107
            if (r5 >= r0) goto L_0x0107
            r0 = r5
            goto L_0x0107
        L_0x00fa:
            r22 = r3
            goto L_0x0101
        L_0x00fd:
            r22 = r3
            r20 = r4
        L_0x0101:
            r23 = r5
            r24 = r6
            r21 = r9
        L_0x0107:
            int r11 = r11 + 1
            r1 = r28
            r4 = r20
            r9 = r21
            r3 = r22
            r5 = r23
            r6 = r24
            goto L_0x008a
        L_0x0117:
            r20 = r4
            r24 = r6
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x014b
            int r1 = r7.size()
            r3 = -1
            int r1 = r1 + r3
        L_0x0126:
            if (r1 < 0) goto L_0x014b
            java.lang.Object r4 = r7.get(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.android.gms.internal.ads.w r4 = r10.mo22031b(r4)
            int r4 = r4.mo21656a()
            if (r4 == r3) goto L_0x013e
            if (r4 <= r0) goto L_0x0141
        L_0x013e:
            r7.remove(r1)
        L_0x0141:
            int r1 = r1 + -1
            r3 = -1
            goto L_0x0126
        L_0x0145:
            r20 = r4
            r24 = r6
            r19 = r8
        L_0x014b:
            r0 = r12[r13]
            r1 = r16
            r3 = 0
        L_0x0150:
            int r4 = r10.f25828a
            if (r3 > 0) goto L_0x018a
            com.google.android.gms.internal.ads.w r4 = r10.mo22031b(r3)
            int r5 = r4.f25126e
            r5 = r0[r3]
            boolean r6 = r2.f20915H
            boolean r5 = m32159m(r5, r6)
            if (r5 == 0) goto L_0x0187
            com.google.android.gms.internal.ads.u44 r5 = new com.google.android.gms.internal.ads.u44
            r6 = r0[r3]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r8 = r7.contains(r8)
            r5.<init>(r4, r2, r6, r8)
            boolean r4 = r5.f24183g
            if (r4 != 0) goto L_0x017c
            boolean r4 = r2.f20908A
            if (r4 != 0) goto L_0x017c
            goto L_0x0187
        L_0x017c:
            if (r1 == 0) goto L_0x0184
            int r4 = r5.compareTo(r1)
            if (r4 <= 0) goto L_0x0187
        L_0x0184:
            r15 = r3
            r1 = r5
            r14 = r10
        L_0x0187:
            int r3 = r3 + 1
            goto L_0x0150
        L_0x018a:
            int r13 = r13 + 1
            r0 = r27
            r16 = r1
            r7 = r17
            r8 = r19
            r4 = r20
            r6 = r24
            r3 = 2
            r11 = 1
            r1 = r28
            goto L_0x0058
        L_0x019e:
            r20 = r4
            r24 = r6
            r19 = r8
            if (r14 != 0) goto L_0x01a8
            r10 = 0
            goto L_0x01b3
        L_0x01a8:
            com.google.android.gms.internal.ads.w44 r10 = new com.google.android.gms.internal.ads.w44
            r0 = 1
            int[] r1 = new int[r0]
            r0 = 0
            r1[r0] = r15
            r10.<init>(r14, r1, r0)
        L_0x01b3:
            r20[r24] = r10
            if (r10 == 0) goto L_0x01bd
            r0 = r28
            r5 = r24
            r7 = 1
            goto L_0x01ca
        L_0x01bd:
            r0 = r28
            r5 = r24
            r7 = 0
            goto L_0x01ca
        L_0x01c3:
            r20 = r4
            r19 = r8
            r0 = r28
            r5 = r6
        L_0x01ca:
            com.google.android.gms.internal.ads.uj0 r1 = r0.mo22168c(r5)
            int r1 = r1.f24343a
            if (r1 <= 0) goto L_0x01d4
            r11 = 1
            goto L_0x01d5
        L_0x01d4:
            r11 = 0
        L_0x01d5:
            r8 = r19 | r11
            goto L_0x01de
        L_0x01d8:
            r0 = r1
            r20 = r4
            r5 = r6
            r19 = r8
        L_0x01de:
            int r6 = r5 + 1
            r1 = r0
            r4 = r20
            r3 = 2
            r0 = r27
            goto L_0x0012
        L_0x01e8:
            r0 = r1
            r20 = r4
            r19 = r8
            r1 = 0
            r3 = -1
            r4 = 0
            r5 = 0
        L_0x01f1:
            r6 = 2
            if (r4 >= r6) goto L_0x0317
            int r6 = r0.mo22166a(r4)
            r7 = 1
            if (r6 != r7) goto L_0x0313
            boolean r6 = r2.f20917J
            if (r6 != 0) goto L_0x0204
            if (r19 != 0) goto L_0x0202
            goto L_0x0204
        L_0x0202:
            r6 = 0
            goto L_0x0205
        L_0x0204:
            r6 = 1
        L_0x0205:
            com.google.android.gms.internal.ads.uj0 r7 = r0.mo22168c(r4)
            r8 = r29[r4]
            r9 = r30[r4]
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
        L_0x0211:
            int r13 = r7.f24343a
            if (r10 >= r13) goto L_0x0258
            com.google.android.gms.internal.ads.xh0 r13 = r7.mo21275b(r10)
            r14 = r8[r10]
            r16 = r11
            r15 = 0
        L_0x021e:
            int r11 = r13.f25828a
            if (r15 > 0) goto L_0x0251
            r11 = r14[r15]
            r17 = r12
            boolean r12 = r2.f20915H
            boolean r11 = m32159m(r11, r12)
            if (r11 == 0) goto L_0x0248
            com.google.android.gms.internal.ads.w r11 = r13.mo22031b(r15)
            com.google.android.gms.internal.ads.k44 r12 = new com.google.android.gms.internal.ads.k44
            r18 = r13
            r13 = r14[r15]
            r12.<init>(r11, r2, r13)
            if (r9 == 0) goto L_0x0243
            int r11 = r12.compareTo(r9)
            if (r11 <= 0) goto L_0x024a
        L_0x0243:
            r16 = r10
            r9 = r12
            r12 = r15
            goto L_0x024c
        L_0x0248:
            r18 = r13
        L_0x024a:
            r12 = r17
        L_0x024c:
            int r15 = r15 + 1
            r13 = r18
            goto L_0x021e
        L_0x0251:
            r17 = r12
            int r10 = r10 + 1
            r11 = r16
            goto L_0x0211
        L_0x0258:
            r10 = -1
            if (r11 != r10) goto L_0x025e
            r6 = 0
            goto L_0x02e5
        L_0x025e:
            com.google.android.gms.internal.ads.xh0 r7 = r7.mo21275b(r11)
            boolean r10 = r2.f26487v
            boolean r10 = r2.f26486u
            if (r6 == 0) goto L_0x02d0
            r6 = r8[r11]
            int r8 = r2.f26481p
            boolean r8 = r2.f20912E
            boolean r8 = r2.f20913F
            boolean r8 = r2.f20914G
            com.google.android.gms.internal.ads.w r8 = r7.mo22031b(r12)
            int r10 = r7.f25828a
            r11 = 1
            int[] r10 = new int[r11]
            r11 = 0
            r13 = 0
        L_0x027d:
            int r14 = r7.f25828a
            if (r11 > 0) goto L_0x02c1
            if (r11 == r12) goto L_0x02b5
            com.google.android.gms.internal.ads.w r14 = r7.mo22031b(r11)
            r15 = r6[r11]
            r16 = r6
            r6 = 0
            boolean r15 = m32159m(r15, r6)
            if (r15 == 0) goto L_0x02bc
            int r6 = r14.f25129h
            r15 = -1
            if (r6 == r15) goto L_0x02bc
            int r6 = r14.f25146y
            if (r6 == r15) goto L_0x02bc
            int r15 = r8.f25146y
            if (r6 != r15) goto L_0x02bc
            java.lang.String r6 = r14.f25133l
            if (r6 == 0) goto L_0x02bc
            java.lang.String r15 = r8.f25133l
            boolean r6 = android.text.TextUtils.equals(r6, r15)
            if (r6 == 0) goto L_0x02bc
            int r6 = r14.f25147z
            r14 = -1
            if (r6 == r14) goto L_0x02bc
            int r14 = r8.f25147z
            if (r6 != r14) goto L_0x02bc
            goto L_0x02b7
        L_0x02b5:
            r16 = r6
        L_0x02b7:
            int r6 = r13 + 1
            r10[r13] = r11
            r13 = r6
        L_0x02bc:
            int r11 = r11 + 1
            r6 = r16
            goto L_0x027d
        L_0x02c1:
            int[] r6 = java.util.Arrays.copyOf(r10, r13)
            int r8 = r6.length
            r10 = 1
            if (r8 <= r10) goto L_0x02d1
            com.google.android.gms.internal.ads.w44 r8 = new com.google.android.gms.internal.ads.w44
            r11 = 0
            r8.<init>(r7, r6, r11)
            goto L_0x02d3
        L_0x02d0:
            r10 = 1
        L_0x02d1:
            r11 = 0
            r8 = 0
        L_0x02d3:
            if (r8 != 0) goto L_0x02de
            com.google.android.gms.internal.ads.w44 r8 = new com.google.android.gms.internal.ads.w44
            int[] r6 = new int[r10]
            r6[r11] = r12
            r8.<init>(r7, r6, r11)
        L_0x02de:
            java.util.Objects.requireNonNull(r9)
            android.util.Pair r6 = android.util.Pair.create(r8, r9)
        L_0x02e5:
            if (r6 == 0) goto L_0x0313
            if (r1 == 0) goto L_0x02f3
            java.lang.Object r7 = r6.second
            com.google.android.gms.internal.ads.k44 r7 = (com.google.android.gms.internal.ads.k44) r7
            int r7 = r7.compareTo(r1)
            if (r7 <= 0) goto L_0x0313
        L_0x02f3:
            r1 = -1
            if (r3 == r1) goto L_0x02f9
            r1 = 0
            r20[r3] = r1
        L_0x02f9:
            java.lang.Object r1 = r6.first
            com.google.android.gms.internal.ads.w44 r1 = (com.google.android.gms.internal.ads.w44) r1
            r20[r4] = r1
            com.google.android.gms.internal.ads.xh0 r3 = r1.f25225a
            int[] r1 = r1.f25226b
            r5 = 0
            r1 = r1[r5]
            com.google.android.gms.internal.ads.w r1 = r3.mo22031b(r1)
            java.lang.String r1 = r1.f25124c
            java.lang.Object r3 = r6.second
            com.google.android.gms.internal.ads.k44 r3 = (com.google.android.gms.internal.ads.k44) r3
            r5 = r1
            r1 = r3
            r3 = r4
        L_0x0313:
            int r4 = r4 + 1
            goto L_0x01f1
        L_0x0317:
            r1 = 0
            r3 = -1
            r4 = 0
        L_0x031a:
            if (r4 >= r6) goto L_0x0417
            int r7 = r0.mo22166a(r4)
            r8 = 1
            if (r7 == r8) goto L_0x0411
            if (r7 == r6) goto L_0x0411
            r6 = 3
            if (r7 == r6) goto L_0x0389
            com.google.android.gms.internal.ads.uj0 r6 = r0.mo22168c(r4)
            r7 = r29[r4]
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0332:
            int r12 = r6.f24343a
            if (r10 >= r12) goto L_0x0376
            com.google.android.gms.internal.ads.xh0 r12 = r6.mo21275b(r10)
            r13 = r7[r10]
            r14 = 0
        L_0x033d:
            int r15 = r12.f25828a
            if (r14 > 0) goto L_0x036f
            r15 = r13[r14]
            r30 = r6
            boolean r6 = r2.f20915H
            boolean r6 = m32159m(r15, r6)
            if (r6 == 0) goto L_0x0366
            com.google.android.gms.internal.ads.w r6 = r12.mo22031b(r14)
            com.google.android.gms.internal.ads.l44 r15 = new com.google.android.gms.internal.ads.l44
            r16 = r7
            r7 = r13[r14]
            r15.<init>(r6, r7)
            if (r9 == 0) goto L_0x0362
            int r6 = r15.compareTo(r9)
            if (r6 <= 0) goto L_0x0368
        L_0x0362:
            r8 = r12
            r11 = r14
            r9 = r15
            goto L_0x0368
        L_0x0366:
            r16 = r7
        L_0x0368:
            int r14 = r14 + 1
            r6 = r30
            r7 = r16
            goto L_0x033d
        L_0x036f:
            r30 = r6
            r16 = r7
            int r10 = r10 + 1
            goto L_0x0332
        L_0x0376:
            if (r8 != 0) goto L_0x037a
            r6 = 0
            goto L_0x0385
        L_0x037a:
            com.google.android.gms.internal.ads.w44 r6 = new com.google.android.gms.internal.ads.w44
            r7 = 1
            int[] r9 = new int[r7]
            r7 = 0
            r9[r7] = r11
            r6.<init>(r8, r9, r7)
        L_0x0385:
            r20[r4] = r6
            goto L_0x0411
        L_0x0389:
            com.google.android.gms.internal.ads.uj0 r6 = r0.mo22168c(r4)
            r7 = r29[r4]
            r8 = 0
            r9 = 0
            r10 = -1
            r11 = 0
        L_0x0393:
            int r12 = r6.f24343a
            if (r11 >= r12) goto L_0x03db
            com.google.android.gms.internal.ads.xh0 r12 = r6.mo21275b(r11)
            r13 = r7[r11]
            r14 = 0
        L_0x039e:
            int r15 = r12.f25828a
            if (r14 > 0) goto L_0x03d4
            r15 = r13[r14]
            r30 = r6
            boolean r6 = r2.f20915H
            boolean r6 = m32159m(r15, r6)
            if (r6 == 0) goto L_0x03cb
            com.google.android.gms.internal.ads.w r6 = r12.mo22031b(r14)
            com.google.android.gms.internal.ads.t44 r15 = new com.google.android.gms.internal.ads.t44
            r16 = r7
            r7 = r13[r14]
            r15.<init>(r6, r2, r7, r5)
            boolean r6 = r15.f23749g
            if (r6 == 0) goto L_0x03cd
            if (r9 == 0) goto L_0x03c7
            int r6 = r15.compareTo(r9)
            if (r6 <= 0) goto L_0x03cd
        L_0x03c7:
            r8 = r12
            r10 = r14
            r9 = r15
            goto L_0x03cd
        L_0x03cb:
            r16 = r7
        L_0x03cd:
            int r14 = r14 + 1
            r6 = r30
            r7 = r16
            goto L_0x039e
        L_0x03d4:
            r30 = r6
            r16 = r7
            int r11 = r11 + 1
            goto L_0x0393
        L_0x03db:
            if (r8 != 0) goto L_0x03df
            r6 = 0
            goto L_0x03f1
        L_0x03df:
            com.google.android.gms.internal.ads.w44 r6 = new com.google.android.gms.internal.ads.w44
            r7 = 1
            int[] r11 = new int[r7]
            r7 = 0
            r11[r7] = r10
            r6.<init>(r8, r11, r7)
            java.util.Objects.requireNonNull(r9)
            android.util.Pair r6 = android.util.Pair.create(r6, r9)
        L_0x03f1:
            if (r6 == 0) goto L_0x0411
            if (r1 == 0) goto L_0x03ff
            java.lang.Object r7 = r6.second
            com.google.android.gms.internal.ads.t44 r7 = (com.google.android.gms.internal.ads.t44) r7
            int r7 = r7.compareTo(r1)
            if (r7 <= 0) goto L_0x0411
        L_0x03ff:
            r7 = -1
            if (r3 == r7) goto L_0x0405
            r1 = 0
            r20[r3] = r1
        L_0x0405:
            java.lang.Object r1 = r6.first
            com.google.android.gms.internal.ads.w44 r1 = (com.google.android.gms.internal.ads.w44) r1
            r20[r4] = r1
            java.lang.Object r1 = r6.second
            com.google.android.gms.internal.ads.t44 r1 = (com.google.android.gms.internal.ads.t44) r1
            r3 = r4
            goto L_0x0412
        L_0x0411:
            r7 = -1
        L_0x0412:
            int r4 = r4 + 1
            r6 = 2
            goto L_0x031a
        L_0x0417:
            r1 = 0
        L_0x0418:
            r3 = 2
            if (r1 >= r3) goto L_0x0494
            r3 = r20[r1]
            int r4 = r0.mo22166a(r1)
            boolean r5 = r2.mo19901f(r1)
            if (r5 != 0) goto L_0x048d
            com.google.android.gms.internal.ads.r43<java.lang.Integer> r5 = r2.f26489x
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L_0x0436
        L_0x0433:
            r3 = 0
            r6 = 0
            goto L_0x048f
        L_0x0436:
            com.google.android.gms.internal.ads.uj0 r4 = r0.mo22168c(r1)
            boolean r5 = r2.mo19902g(r1, r4)
            if (r5 == 0) goto L_0x0453
            com.google.android.gms.internal.ads.s44 r3 = r2.mo19899e(r1, r4)
            if (r3 != 0) goto L_0x0447
            goto L_0x0433
        L_0x0447:
            com.google.android.gms.internal.ads.w44 r3 = new com.google.android.gms.internal.ads.w44
            r5 = 0
            com.google.android.gms.internal.ads.xh0 r4 = r4.mo21275b(r5)
            r6 = 0
            r3.<init>(r4, r6, r5)
            goto L_0x048f
        L_0x0453:
            r6 = 0
            r5 = 0
        L_0x0455:
            int r7 = r4.f24343a
            if (r5 >= r7) goto L_0x048f
            com.google.android.gms.internal.ads.xh0 r7 = r4.mo21275b(r5)
            com.google.android.gms.internal.ads.k43<com.google.android.gms.internal.ads.xh0, com.google.android.gms.internal.ads.xo0> r8 = r2.f26488w
            java.lang.Object r8 = r8.get(r7)
            com.google.android.gms.internal.ads.xo0 r8 = (com.google.android.gms.internal.ads.xo0) r8
            if (r8 == 0) goto L_0x048a
            com.google.android.gms.internal.ads.w44 r3 = new com.google.android.gms.internal.ads.w44
            com.google.android.gms.internal.ads.r43<java.lang.Integer> r4 = r8.f25907a
            java.lang.Object[] r4 = r4.toArray()
            int r5 = r4.length
            int[] r8 = new int[r5]
            r9 = 0
        L_0x0473:
            if (r9 >= r5) goto L_0x0485
            r10 = r4[r9]
            java.util.Objects.requireNonNull(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x0473
        L_0x0485:
            r9 = 0
            r3.<init>(r7, r8, r9)
            goto L_0x048f
        L_0x048a:
            int r5 = r5 + 1
            goto L_0x0455
        L_0x048d:
            r6 = 0
            r3 = r6
        L_0x048f:
            r20[r1] = r3
            int r1 = r1 + 1
            goto L_0x0418
        L_0x0494:
            r1 = r27
            r6 = 0
            com.google.android.gms.internal.ads.e44 r3 = r1.f24583d
            com.google.android.gms.internal.ads.l54 r4 = r27.mo16075c()
            com.google.android.gms.internal.ads.g43 r5 = com.google.android.gms.internal.ads.f44.m23470e(r20)
            r7 = 2
            com.google.android.gms.internal.ads.h44[] r13 = new com.google.android.gms.internal.ads.h44[r7]
            r14 = 0
        L_0x04a5:
            if (r14 >= r7) goto L_0x04e6
            r7 = r20[r14]
            if (r7 == 0) goto L_0x04df
            int[] r9 = r7.f25226b
            int r8 = r9.length
            if (r8 != 0) goto L_0x04b1
            goto L_0x04df
        L_0x04b1:
            r15 = 1
            if (r8 != r15) goto L_0x04ca
            com.google.android.gms.internal.ads.x44 r8 = new com.google.android.gms.internal.ads.x44
            com.google.android.gms.internal.ads.xh0 r7 = r7.f25225a
            r16 = 0
            r23 = r9[r16]
            r24 = 0
            r25 = 0
            r26 = 0
            r21 = r8
            r22 = r7
            r21.<init>(r22, r23, r24, r25, r26)
            goto L_0x04dc
        L_0x04ca:
            r16 = 0
            com.google.android.gms.internal.ads.xh0 r8 = r7.f25225a
            r10 = 0
            java.lang.Object r7 = r5.get(r14)
            r12 = r7
            com.google.android.gms.internal.ads.g43 r12 = (com.google.android.gms.internal.ads.g43) r12
            r7 = r3
            r11 = r4
            com.google.android.gms.internal.ads.f44 r8 = r7.mo17117a(r8, r9, r10, r11, r12)
        L_0x04dc:
            r13[r14] = r8
            goto L_0x04e2
        L_0x04df:
            r15 = 1
            r16 = 0
        L_0x04e2:
            int r14 = r14 + 1
            r7 = 2
            goto L_0x04a5
        L_0x04e6:
            r16 = 0
            com.google.android.gms.internal.ads.nu3[] r3 = new com.google.android.gms.internal.ads.nu3[r7]
            r5 = 0
        L_0x04eb:
            if (r5 >= r7) goto L_0x0518
            int r4 = r0.mo22166a(r5)
            boolean r8 = r2.mo19901f(r5)
            if (r8 != 0) goto L_0x0512
            com.google.android.gms.internal.ads.r43<java.lang.Integer> r8 = r2.f26489x
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r8.contains(r4)
            if (r4 == 0) goto L_0x0504
            goto L_0x0512
        L_0x0504:
            int r4 = r0.mo22166a(r5)
            r8 = -2
            if (r4 == r8) goto L_0x050f
            r4 = r13[r5]
            if (r4 == 0) goto L_0x0512
        L_0x050f:
            com.google.android.gms.internal.ads.nu3 r4 = com.google.android.gms.internal.ads.nu3.f20733a
            goto L_0x0513
        L_0x0512:
            r4 = r6
        L_0x0513:
            r3[r5] = r4
            int r5 = r5 + 1
            goto L_0x04eb
        L_0x0518:
            boolean r0 = r2.f20916I
            android.util.Pair r0 = android.util.Pair.create(r3, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v44.mo21424f(com.google.android.gms.internal.ads.y44, int[][][], int[], com.google.android.gms.internal.ads.f24, com.google.android.gms.internal.ads.bg0):android.util.Pair");
    }

    /* renamed from: h */
    public final o44 mo21425h() {
        return this.f24582c.get();
    }

    /* renamed from: l */
    public final void mo21426l(q44 q44) {
        o44 o44 = new o44(q44);
        if (!this.f24582c.getAndSet(o44).equals(o44)) {
            mo16077e();
        }
    }
}

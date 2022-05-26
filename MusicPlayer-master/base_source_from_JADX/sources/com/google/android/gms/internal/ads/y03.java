package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.un4seen.bass.BASS;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class y03 {

    /* renamed from: a */
    public static final int f26193a = (Build.VERSION.SDK_INT > 22 ? BASS.BASS_SPEAKER_REAR2 : 0);

    /* renamed from: b */
    public static final ClipData f26194b = ClipData.newIntent(BuildConfig.FLAVOR, new Intent());

    /* renamed from: a */
    public static PendingIntent m33947a(Context context, int i, Intent intent, int i2, int i3) {
        boolean z = true;
        s13.m30502e((i2 & 95) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        s13.m30502e(intent.getComponent() != null, "Must set component on Intent.");
        if (m33948b(0, 1)) {
            s13.m30502e(!m33948b(i2, BASS.BASS_SPEAKER_REAR2), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !m33948b(i2, BASS.BASS_SPEAKER_REAR2)) {
                z = false;
            }
            s13.m30502e(z, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !m33948b(i2, BASS.BASS_SPEAKER_REAR2)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!m33948b(0, 3) && intent2.getAction() == null) {
                intent2.setAction(BuildConfig.FLAVOR);
            }
            if (!m33948b(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory(BuildConfig.FLAVOR);
            }
            if (!m33948b(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!m33948b(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f26194b);
            }
        }
        return PendingIntent.getService(context, 0, intent2, i2);
    }

    /* renamed from: b */
    private static boolean m33948b(int i, int i2) {
        return (i & i2) == i2;
    }
}

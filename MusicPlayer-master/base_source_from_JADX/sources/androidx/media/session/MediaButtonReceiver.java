package androidx.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.p001v4.media.MediaBrowserCompat;
import android.support.p001v4.media.session.MediaControllerCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.support.p001v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: androidx.media.session.MediaButtonReceiver$a */
    private static class C0775a extends MediaBrowserCompat.C0006b {

        /* renamed from: c */
        private final Context f3466c;

        /* renamed from: d */
        private final Intent f3467d;

        /* renamed from: e */
        private final BroadcastReceiver.PendingResult f3468e;

        /* renamed from: f */
        private MediaBrowserCompat f3469f;

        C0775a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f3466c = context;
            this.f3467d = intent;
            this.f3468e = pendingResult;
        }

        /* renamed from: e */
        private void m4448e() {
            this.f3469f.mo8b();
            this.f3468e.finish();
        }

        /* renamed from: a */
        public void mo20a() {
            new MediaControllerCompat(this.f3466c, this.f3469f.mo9c()).mo111a((KeyEvent) this.f3467d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            m4448e();
        }

        /* renamed from: b */
        public void mo21b() {
            m4448e();
        }

        /* renamed from: c */
        public void mo22c() {
            m4448e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4401f(MediaBrowserCompat mediaBrowserCompat) {
            this.f3469f = mediaBrowserCompat;
        }
    }

    /* renamed from: a */
    public static PendingIntent m4443a(Context context, long j) {
        ComponentName c = m4445c(context);
        if (c != null) {
            return m4444b(context, c, j);
        }
        Log.w("MediaButtonReceiver", "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.");
        return null;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    public static PendingIntent m4444b(Context context, ComponentName componentName, long j) {
        if (componentName == null) {
            Log.w("MediaButtonReceiver", "The component name of media button receiver should be provided.");
            return null;
        }
        int i = PlaybackStateCompat.m351i(j);
        if (i == 0) {
            Log.w("MediaButtonReceiver", "Cannot build a media button pending intent with the given action: " + j);
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
        if (Build.VERSION.SDK_INT >= 16) {
            intent.addFlags(268435456);
        }
        return PendingIntent.getBroadcast(context, i, intent, MediaSessionCompat.f93d);
    }

    /* renamed from: c */
    public static ComponentName m4445c(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        } else if (queryBroadcastReceivers.size() <= 1) {
            return null;
        } else {
            Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            return null;
        }
    }

    /* renamed from: d */
    private static ComponentName m4446d(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }

    /* renamed from: e */
    private static void m4447e(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName d = m4446d(context, "android.intent.action.MEDIA_BUTTON");
        if (d != null) {
            intent.setComponent(d);
            m4447e(context, intent);
            return;
        }
        ComponentName d2 = m4446d(context, "android.media.browse.MediaBrowserService");
        if (d2 != null) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            C0775a aVar = new C0775a(applicationContext, intent, goAsync);
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, d2, aVar, (Bundle) null);
            aVar.mo4401f(mediaBrowserCompat);
            mediaBrowserCompat.mo7a();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }
}

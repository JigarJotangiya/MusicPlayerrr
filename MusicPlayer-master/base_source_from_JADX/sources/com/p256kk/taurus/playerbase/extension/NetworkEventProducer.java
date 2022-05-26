package com.p256kk.taurus.playerbase.extension;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.p256kk.taurus.playerbase.p261e.C6640b;
import com.p256kk.taurus.playerbase.p267k.C6697a;
import java.lang.ref.WeakReference;

/* renamed from: com.kk.taurus.playerbase.extension.NetworkEventProducer */
public class NetworkEventProducer extends C6643a {

    /* renamed from: b */
    private Context f30032b;

    /* renamed from: c */
    private NetChangeBroadcastReceiver f30033c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f30034d;

    /* renamed from: e */
    private Handler f30035e = new C6642a(Looper.getMainLooper());

    /* renamed from: com.kk.taurus.playerbase.extension.NetworkEventProducer$NetChangeBroadcastReceiver */
    public static class NetChangeBroadcastReceiver extends BroadcastReceiver {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Handler f30036a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public WeakReference<Context> f30037b;

        /* renamed from: c */
        private Runnable f30038c = new C6641a();

        /* renamed from: com.kk.taurus.playerbase.extension.NetworkEventProducer$NetChangeBroadcastReceiver$a */
        class C6641a implements Runnable {
            C6641a() {
            }

            public void run() {
                if (NetChangeBroadcastReceiver.this.f30037b != null && NetChangeBroadcastReceiver.this.f30037b.get() != null) {
                    int a = C6697a.m38413a((Context) NetChangeBroadcastReceiver.this.f30037b.get());
                    Message obtain = Message.obtain();
                    obtain.what = 100;
                    obtain.obj = Integer.valueOf(a);
                    NetChangeBroadcastReceiver.this.f30036a.sendMessage(obtain);
                }
            }
        }

        public NetChangeBroadcastReceiver(Context context, Handler handler) {
            this.f30037b = new WeakReference<>(context);
            this.f30036a = handler;
        }

        /* renamed from: c */
        public void mo25938c() {
            this.f30036a.removeCallbacks(this.f30038c);
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                this.f30036a.removeCallbacks(this.f30038c);
                this.f30036a.postDelayed(this.f30038c, 1000);
            }
        }
    }

    /* renamed from: com.kk.taurus.playerbase.extension.NetworkEventProducer$a */
    class C6642a extends Handler {
        C6642a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int intValue;
            super.handleMessage(message);
            if (message.what == 100 && NetworkEventProducer.this.f30034d != (intValue = ((Integer) message.obj).intValue())) {
                int unused = NetworkEventProducer.this.f30034d = intValue;
                C6656h f = NetworkEventProducer.this.mo25945f();
                if (f != null) {
                    f.mo25954a("network_state", NetworkEventProducer.this.f30034d);
                    C6640b.m38216a("NetworkEventProducer", "onNetworkChange : " + NetworkEventProducer.this.f30034d);
                }
            }
        }
    }

    public NetworkEventProducer(Context context) {
        this.f30032b = context.getApplicationContext();
    }

    /* renamed from: i */
    private void m38221i() {
        m38222j();
        if (this.f30032b != null) {
            this.f30033c = new NetChangeBroadcastReceiver(this.f30032b, this.f30035e);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.f30032b.registerReceiver(this.f30033c, intentFilter);
        }
    }

    /* renamed from: j */
    private void m38222j() {
        NetChangeBroadcastReceiver netChangeBroadcastReceiver;
        try {
            Context context = this.f30032b;
            if (context != null && (netChangeBroadcastReceiver = this.f30033c) != null) {
                context.unregisterReceiver(netChangeBroadcastReceiver);
                this.f30033c = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo25935a() {
        this.f30034d = C6697a.m38413a(this.f30032b);
        m38221i();
    }

    /* renamed from: b */
    public void mo25936b() {
        destroy();
    }

    public void destroy() {
        NetChangeBroadcastReceiver netChangeBroadcastReceiver = this.f30033c;
        if (netChangeBroadcastReceiver != null) {
            netChangeBroadcastReceiver.mo25938c();
        }
        m38222j();
        this.f30035e.removeMessages(100);
    }
}

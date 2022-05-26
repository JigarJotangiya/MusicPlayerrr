package com.p256kk.taurus.playerbase.p263g;

import java.util.Comparator;

/* renamed from: com.kk.taurus.playerbase.g.j */
/* compiled from: IReceiverGroup */
public interface C6668j {

    /* renamed from: com.kk.taurus.playerbase.g.j$a */
    /* compiled from: IReceiverGroup */
    public interface C6669a {
        /* renamed from: a */
        void mo10289a(String str, Object obj);

        /* renamed from: b */
        String[] mo10290b();
    }

    /* renamed from: com.kk.taurus.playerbase.g.j$b */
    /* compiled from: IReceiverGroup */
    public interface C6670b {
        /* renamed from: a */
        void mo25933a(C6667i iVar);
    }

    /* renamed from: com.kk.taurus.playerbase.g.j$c */
    /* compiled from: IReceiverGroup */
    public interface C6671c {
        /* renamed from: a */
        boolean mo25934a(C6667i iVar);
    }

    /* renamed from: com.kk.taurus.playerbase.g.j$d */
    /* compiled from: IReceiverGroup */
    public interface C6672d {
        /* renamed from: a */
        void mo26012a(String str, C6667i iVar);

        /* renamed from: b */
        void mo26013b(String str, C6667i iVar);
    }

    /* renamed from: a */
    C6665g mo26005a();

    /* renamed from: b */
    void mo26006b(C6672d dVar);

    /* renamed from: c */
    void mo26007c(C6671c cVar, C6670b bVar);

    /* renamed from: d */
    void mo26008d(C6672d dVar);

    /* renamed from: e */
    <T extends C6667i> T mo26009e(String str);

    /* renamed from: f */
    void mo26010f(C6670b bVar);

    void sort(Comparator<C6667i> comparator);
}

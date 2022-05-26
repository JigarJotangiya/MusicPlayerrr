package p159f.p166c.p224o.p226l;

import android.content.Context;
import com.coocent.videostore.p067po.Video;
import java.util.List;
import p159f.p166c.p222m.C4613a;
import p159f.p166c.p222m.C4615b;
import p159f.p166c.p222m.C4616c;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.o.l.o */
/* compiled from: OperateUtils.kt */
public final class C4666o {

    /* renamed from: a */
    public static final C4666o f13452a = new C4666o();

    /* renamed from: b */
    private static C4613a f13453b;

    static {
        C4616c a = C4615b.m20080a();
        f13453b = a == null ? null : a.mo15370a();
    }

    private C4666o() {
    }

    /* renamed from: a */
    public final List<Video> mo15397a(Context context, int i, List<Video> list, List<Video> list2) {
        int size;
        C8594l.m46771e(context, "context");
        C8594l.m46771e(list, "operateVideos");
        C8594l.m46771e(list2, "dataList");
        if (i == 0) {
            int size2 = list.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i2 = size2 - 1;
                    int size3 = list2.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i3 = size3 - 1;
                            if (list.get(size2).mo10553l() == list2.get(size3).mo10553l()) {
                                list2.remove(size3);
                            }
                            if (i3 < 0) {
                                break;
                            }
                            size3 = i3;
                        }
                    }
                    if (i2 < 0) {
                        break;
                    }
                    size2 = i2;
                }
            }
        } else if (i == 1) {
            for (Video next : list2) {
                for (Video next2 : list) {
                    if (next2.mo10553l() == next.mo10553l()) {
                        next.mo10538a0(next2.mo10565w());
                        next.mo10519F(next2.mo10565w() + '.' + next2.mo10548h());
                    }
                }
            }
        } else if (i == 2) {
            int size4 = list.size() - 1;
            if (size4 >= 0) {
                while (true) {
                    int i4 = size4 - 1;
                    int size5 = list2.size() - 1;
                    if (size5 >= 0) {
                        while (true) {
                            int i5 = size5 - 1;
                            if (list.get(size4).mo10553l() == list2.get(size5).mo10553l()) {
                                list2.remove(size5);
                            }
                            if (i5 < 0) {
                                break;
                            }
                            size5 = i5;
                        }
                    }
                    if (i4 < 0) {
                        break;
                    }
                    size4 = i4;
                }
            }
        } else if (i == 3 && (size = list.size() - 1) >= 0) {
            while (true) {
                int i6 = size - 1;
                int size6 = list2.size() - 1;
                if (size6 >= 0) {
                    while (true) {
                        int i7 = size6 - 1;
                        if (list.get(size).mo10553l() == list2.get(size6).mo10553l()) {
                            list2.remove(size6);
                        }
                        if (i7 < 0) {
                            break;
                        }
                        size6 = i7;
                    }
                }
                if (i6 < 0) {
                    break;
                }
                size = i6;
            }
        }
        C4613a aVar = f13453b;
        if (aVar != null) {
            aVar.mo15363i(context, i, C8490t.m46678C(list), C8490t.m46678C(list2));
        }
        return list2;
    }
}

package coocent.music.player.adapter;

import android.widget.ImageView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import coocent.music.player.mode.C7058c;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

public class ArtistItemOptionAdapter extends BaseQuickAdapter<C7058c, BaseViewHolder> {

    /* renamed from: c */
    public static int f31091c = 5;

    /* renamed from: a */
    private long f31092a;

    /* renamed from: b */
    private int f31093b;

    public ArtistItemOptionAdapter(int i, List<C7058c> list) {
        super(i, list);
    }

    /* renamed from: d */
    private void m39944d(BaseViewHolder baseViewHolder) {
        boolean z;
        if (baseViewHolder.getAdapterPosition() == 0) {
            ((ImageView) baseViewHolder.getView(R.id.option_image)).setImageDrawable(C8343s.m46304l(R.drawable.ic_library_more_palynext, R.color.default_text_color));
        } else if (baseViewHolder.getAdapterPosition() == 1) {
            C8321j.m46000f(R.drawable.ic_library_more_playlist, (ImageView) baseViewHolder.getView(R.id.option_image));
        } else if (baseViewHolder.getAdapterPosition() == 2) {
            C8321j.m46000f(R.drawable.ic_library_more_add_queue, (ImageView) baseViewHolder.getView(R.id.option_image));
        } else if (baseViewHolder.getAdapterPosition() == 3) {
            if (this.f31093b == 2) {
                C8321j.m46000f(R.drawable.ic_library_more_view_singer, (ImageView) baseViewHolder.getView(R.id.option_image));
            } else {
                C8321j.m46000f(R.drawable.ic_library_more_albums_2, (ImageView) baseViewHolder.getView(R.id.option_image));
            }
        } else if (baseViewHolder.getAdapterPosition() == 4) {
            C8321j.m46000f(R.drawable.ic_library_more_add_delete, (ImageView) baseViewHolder.getView(R.id.option_image));
        } else if (baseViewHolder.getAdapterPosition() == f31091c) {
            if (this.f31093b == 2) {
                z = C4477c.m19611c(C8345u.m46327h(), this.f31092a);
            } else {
                z = C4477c.m19609b(C8345u.m46327h(), this.f31092a);
            }
            if (z) {
                C8321j.m46000f(R.drawable.ic_library_more_favorite, (ImageView) baseViewHolder.getView(R.id.option_image));
            } else {
                C8321j.m46000f(R.drawable.ic_library_more_favorite2, (ImageView) baseViewHolder.getView(R.id.option_image));
            }
        }
        ((ImageView) baseViewHolder.getView(R.id.option_image)).setBackground(C8343s.m46298f(R.drawable.popup_item_shape));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void convert(BaseViewHolder baseViewHolder, C7058c cVar) {
        baseViewHolder.setText((int) R.id.option_text, (CharSequence) cVar.mo27084a());
        m39944d(baseViewHolder);
        baseViewHolder.setTextColor(R.id.option_text, C8343s.m46295c(R.color.default_text_color));
    }

    /* renamed from: e */
    public void mo26885e(long j, int i) {
        this.f31092a = j;
        this.f31093b = i;
    }
}

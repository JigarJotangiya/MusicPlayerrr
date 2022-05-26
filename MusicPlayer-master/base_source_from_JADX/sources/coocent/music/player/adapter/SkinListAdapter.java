package coocent.music.player.adapter;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.un4seen.bass.BASS;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.skin.net.MySkinEntity;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.p461z.C9566f;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

public class SkinListAdapter extends BaseQuickAdapter<MySkinEntity, BaseViewHolder> {

    /* renamed from: b */
    public static int f31102b;

    /* renamed from: a */
    private int f31103a;

    public SkinListAdapter(int i, List<MySkinEntity> list) {
        super(i, list);
        m39966d();
        f31102b = C8345u.m46323d(5);
    }

    /* renamed from: d */
    private void m39966d() {
        this.f31103a = ((((C9566f.f36725a - (f31102b * 2)) - C8345u.m46323d(10)) / 3) * 889) / BASS.BASS_ERROR_JAVA_CLASS;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void convert(BaseViewHolder baseViewHolder, MySkinEntity mySkinEntity) {
        baseViewHolder.setText((int) R.id.tv_skin_name, (CharSequence) mySkinEntity.mo27309e());
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.iv_thumbnail);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = this.f31103a;
        imageView.setLayoutParams(layoutParams);
        C8321j.m45998d(this.mContext, mySkinEntity.mo27310f(), R.drawable.theme_img_default, imageView);
        if (mySkinEntity.mo27305a() == BaseApplication.f31162z) {
            baseViewHolder.setBackgroundColor(R.id.tv_skin_name, this.mContext.getResources().getColor(R.color.skin_card_black_style_color));
        } else if (mySkinEntity.mo27305a() == BaseApplication.f31138A) {
            baseViewHolder.setBackgroundColor(R.id.tv_skin_name, this.mContext.getResources().getColor(R.color.skin_card_white_style_color));
        } else if (mySkinEntity.mo27305a() == BaseApplication.f31139B) {
            baseViewHolder.setBackgroundColor(R.id.tv_skin_name, this.mContext.getResources().getColor(R.color.skin_card_green_style_color));
        } else if (mySkinEntity.mo27305a() == BaseApplication.f31140C) {
            baseViewHolder.setBackgroundColor(R.id.tv_skin_name, this.mContext.getResources().getColor(R.color.skin_card_skin4_style_color));
        }
        ImageView imageView2 = (ImageView) baseViewHolder.getView(R.id.iv_select);
        if (C8343s.f34788c == mySkinEntity.mo27305a()) {
            imageView2.setVisibility(0);
            if (C8345u.m46336q()) {
                imageView2.setImageDrawable(C9332d.m49407d(this.mContext, R.drawable.theme_icon_selected2));
            } else {
                imageView2.setImageDrawable(C9332d.m49407d(this.mContext, R.drawable.theme_icon_selected));
            }
            baseViewHolder.setTextColor(R.id.tv_skin_name, C9332d.m49405b(this.mContext, R.color.colorAccent));
            return;
        }
        imageView2.setVisibility(8);
        baseViewHolder.setTextColor(R.id.tv_skin_name, C9332d.m49405b(this.mContext, R.color.white));
    }
}

package com.majesty.pmbpoltekpos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
    CardView cvRaport, cvReguler, cvUndangan, cvMandiri, cvProgramRpl, cvBeasiswaAperti;

//    private AppBarConfiguration mAppBarConfiguration;
//    FirebaseDatabase database;
//    DatabaseReference categoryRef;
//    TextView txtFullname;
//    RecyclerView recyclerView;
//    RecyclerView.LayoutManager layoutManager;
//    FirebaseRecyclerAdapter<Category, MenuViewHolder> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Panduan Pendaftaran");
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer,
                toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        cvRaport = findViewById(R.id.raport);
        cvRaport.setOnClickListener(this);

        cvReguler = findViewById(R.id.reguler);
        cvReguler.setOnClickListener(this);

        cvUndangan = findViewById(R.id.undangan);
        cvUndangan.setOnClickListener(this);

        cvMandiri = findViewById(R.id.mandiri);
        cvMandiri.setOnClickListener(this);

        cvProgramRpl = findViewById(R.id.program_rpl);
        cvProgramRpl.setOnClickListener(this);

        cvBeasiswaAperti = findViewById(R.id.beasiswa_aperti);
        cvBeasiswaAperti.setOnClickListener(this);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
//        mAppBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.nav_menu, R.id.nav_cart, R.id.nav_order,
//                R.id.nav_logout)
//                .setDrawerLayout(drawer)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
//        NavigationUI.setupWithNavController(navigationView, navController);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

//    @Override
//    public boolean onSupportNavigateUp() {
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
//                || super.onSupportNavigateUp();
//    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings){
            return true;
        }else {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_panduan){
//            Intent panduanIntent = new Intent(this, PanduanActivity.class);
//            panduanIntent.putExtra("url", "https://form.poltekpos.ac.id/");
//            startActivity(panduanIntent);
        }else if (id == R.id.nav_daftar){
            Intent daftarIntent = new Intent(this, WebViewActivity.class);
            daftarIntent.putExtra("url", "https://form.poltekpos.ac.id/");
            startActivity(daftarIntent);
        }else if (id == R.id.nav_pengumuman){
            Intent pengumumanIntent = new Intent(this, WebViewActivity.class);
            pengumumanIntent.putExtra("url", "https://form.poltekpos.ac.id/pengumuman");
            startActivity(pengumumanIntent);
        }else if (id == R.id.nav_daftar_ulang){
            Intent herregisIntent = new Intent(this, WebViewActivity.class);
            herregisIntent.putExtra("url", "https://form.poltekpos.ac.id/pengumuman");
            startActivity(herregisIntent);
        }else if (id == R.id.nav_pembayaran){
            Intent pembayaranIntent = new Intent(this, WebViewActivity.class);
            pembayaranIntent.putExtra("url", "https://pmb.poltekpos.ac.id/biaya-pembayaran/");
            startActivity(pembayaranIntent);
        }else if (id == R.id.nav_jadwal){
            Intent jadwalIntent = new Intent(this, WebViewActivity.class);
            jadwalIntent.putExtra("url", "https://pmb.poltekpos.ac.id/jadwal-pendaftaran/");
            startActivity(jadwalIntent);
        }else if (id == R.id.nav_FAQ){
            Intent faqIntent = new Intent(this, WebViewActivity.class);
            faqIntent.putExtra("url", "https://pmb.poltekpos.ac.id/faq/");
            startActivity(faqIntent);
        }else if (id == R.id.nav_Admin){
            Intent adminIntent = new Intent(this, AdminActivity.class);
            startActivity(adminIntent);
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.raport:
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("url", "https://pmb.poltekpos.ac.id/pmdk/");
                startActivity(intent);
                break;

            case R.id.reguler:
                Intent intent1 = new Intent(MainActivity.this, WebViewActivity.class);
                intent1.putExtra("url", "https://pmb.poltekpos.ac.id/reguler/");
                startActivity(intent1);
                break;

            case R.id.undangan:
                Intent intent2 = new Intent(MainActivity.this, WebViewActivity.class);
                intent2.putExtra("url", "https://pmb.poltekpos.ac.id/undangan/");
                startActivity(intent2);
                break;

            case R.id.mandiri:
                Intent intent3 = new Intent(MainActivity.this, WebViewActivity.class);
                intent3.putExtra("url", "https://pmb.poltekpos.ac.id/mandiri/");
                startActivity(intent3);
                break;

            case R.id.program_rpl:
                Intent intent4 = new Intent(MainActivity.this, WebViewActivity.class);
                intent4.putExtra("url", "https://pmb.poltekpos.ac.id/program-rpl/");
                startActivity(intent4);
                break;

            case R.id.beasiswa_aperti:
                Intent intent5 = new Intent(MainActivity.this, WebViewActivity.class);
                intent5.putExtra("url", "https://pmb.poltekpos.ac.id/beasiswa/");
                startActivity(intent5);
                break;
        }
    }
}


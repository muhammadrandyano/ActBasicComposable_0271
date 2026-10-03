package com.example.pam_3.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pam_3.R // Sesuaikan R dengan nama package project Anda

@Composable
fun Tugas(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        // 1. Gambar Background (Pemandangan Gunung)
        Image(
            painter = painterResource(id = R.drawable.bg_gunung),
            contentDescription = "Background Gunung",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // Overlay Gradient Gelap/Transparan agar teks tetap terbaca
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color(0xCC000000),
                            Color(0x33000000),
                            Color(0xCC000000)
                        )
                    )
                )
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 48.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Teks Header Login
            Text(
                text = "LOGIN",
                color = Color.Blue,
                fontSize = 34.sp,
                fontWeight = FontWeight.ExtraBold,
                letterSpacing = 2.sp,
                style = TextStyle(
                    shadow = Shadow(
                        color = Color.White,
                        offset = Offset(0f, 0f),
                        blurRadius = 16f
                    )
                )
            )
            Text(
                text = "INI HALAMAN LOGIN,",
                color = Color.White,
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            // 2. Logo Gunung Prau (Pengganti Logo UMY/Lookism)
            Image(
                painter = painterResource(id = R.drawable.logo_prau),
                contentDescription = "Logo Mount Prau",
                modifier = Modifier.size(120.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Text Label & Data Diri
            Text(
                text = "Nama",
                color = Color.Red,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = 3.sp
            )
            Text(
                text = "Muhammad Randyano",
                color = Color.Blue,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "20240140271",
                color = Color.White,
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold
            )

            Spacer(modifier = Modifier.height(20.dp))

            // 3. Foto Diri dalam bentuk Lingkaran
            FotoProfil()
        }
    }
}

// Fungsi Composable untuk Menampilkan Foto Profil Bulat
@Composable
fun FotoProfil() {
    Image(
        painter = painterResource(id = R.drawable.foto_profil),
        contentDescription = "Foto Profil Muhammad Randyano",
        modifier = Modifier
            .size(240.dp)
            .clip(CircleShape), // Membuat gambar berbentuk bulat/lingkaran penuh
        contentScale = ContentScale.Crop
    )
}
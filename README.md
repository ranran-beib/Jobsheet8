Percobaan 1
  1. Program akan mencetak satu bintang lebih banyak (N+1 bintang) >> Karena i mulai dari 0, maka iterasi terjadi dari i=0 hingga i=N, total N+1 kali.
  2. Perulangan tidak akan berjalan sama sekali >> Karena i=1 (default) dan kondisi harus i > N (misalnya N=5), maka kondisi awal tidak terpenuhi sehingga loop tidak dieksekusi.
  3. Perulangan bisa menjadi infinite loop (tak berujung) jika kondisi i <= N tetap >> Karena i berkurang setiap loop tetapi kondisi tetap i <= N, maka i tidak pernah melebihi N dan loop terus berjalan tanpa berhenti.

Percobaan 2
  1. Perulangan luar akan berjalan satu kali lebih banyak, karena nilai awal iOuter menjadi 0 sehingga loop berjalan untuk iOuter=0,1,...,N.
  2. Perulangan dalam akan mencetak satu bintang (*) lebih banyak pada setiap baris.
  3. Outer loop untuk mengontrol "berapa kali" inner loop dijalankan. Inner loop untuk melakukan aktivitas detail dalam 1 iterasi outer loop.
  4. Membuat pindah baris setelah selesai mencetak satu baris bintang supaya hasilnya membentuk persegi.

Percobaan 3
  1. Tidak sesuai, karena program awal mencetak 6 baris, bukan 5 (dengan baris awal kosong) >> menggunakan i = 0.
  2. Indeks perulangan pada while(i <= X) harus diperhatikan agar sesuai jumlah baris.

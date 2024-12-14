package com.multiguna.testcode.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FirstNonRepeating {

//    public ResponseEntity<Integer> findFirstNonRepeating(List<Integer> numbers) {
//        Map<Integer, Integer> countMap = new HashMap<>();
//
//        // Hitung frekuensi setiap angka
//        for (int num : numbers) {
//            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//        }
//
//        // Cari angka pertama yang tidak berulang
//        for (int num : numbers) {
//            if (countMap.get(num) == 1) {
//                return ResponseEntity.ok(num); // Angka ditemukan
//            }
//        }
//
//        // Jika tidak ada angka yang tidak berulang
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(-1);
//    }
    public ResponseEntity<Integer> findFirstNonRepeating(List<Integer> numbers) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Hitung frekuensi setiap angka
        for (int num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Periksa apakah ada angka berulang
        boolean hasRepeating = countMap.values().stream().anyMatch(count -> count > 1);
        if (!hasRepeating) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(-1); // Tidak ada angka berulang
        }

        // Cari angka pertama yang tidak berulang
        for (int num : numbers) {
            if (countMap.get(num) == 1) {
                return ResponseEntity.ok(num); // Angka ditemukan
            }
        }

        // Jika tidak ada angka yang tidak berulang
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(-1);
    }

}


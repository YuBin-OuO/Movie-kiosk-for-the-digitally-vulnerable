@echo off
"C:\\Users\\CHO_YUBIN\\AppData\\Local\\Android\\Sdk\\cmake\\3.18.1\\bin\\cmake.exe" ^
  "-HC:\\Users\\CHO_YUBIN\\Desktop\\HH\\Kiosker\\App2\\sdk\\libcxx_helper" ^
  "-DCMAKE_SYSTEM_NAME=Android" ^
  "-DCMAKE_EXPORT_COMPILE_COMMANDS=ON" ^
  "-DCMAKE_SYSTEM_VERSION=21" ^
  "-DANDROID_PLATFORM=android-21" ^
  "-DANDROID_ABI=armeabi-v7a" ^
  "-DCMAKE_ANDROID_ARCH_ABI=armeabi-v7a" ^
  "-DANDROID_NDK=C:\\Users\\CHO_YUBIN\\AppData\\Local\\Android\\Sdk\\ndk\\23.1.7779620" ^
  "-DCMAKE_ANDROID_NDK=C:\\Users\\CHO_YUBIN\\AppData\\Local\\Android\\Sdk\\ndk\\23.1.7779620" ^
  "-DCMAKE_TOOLCHAIN_FILE=C:\\Users\\CHO_YUBIN\\AppData\\Local\\Android\\Sdk\\ndk\\23.1.7779620\\build\\cmake\\android.toolchain.cmake" ^
  "-DCMAKE_MAKE_PROGRAM=C:\\Users\\CHO_YUBIN\\AppData\\Local\\Android\\Sdk\\cmake\\3.18.1\\bin\\ninja.exe" ^
  "-DCMAKE_LIBRARY_OUTPUT_DIRECTORY=C:\\Users\\CHO_YUBIN\\Desktop\\HH\\Kiosker\\App2\\sdk\\build\\intermediates\\cxx\\Debug\\2y94v28w\\obj\\armeabi-v7a" ^
  "-DCMAKE_RUNTIME_OUTPUT_DIRECTORY=C:\\Users\\CHO_YUBIN\\Desktop\\HH\\Kiosker\\App2\\sdk\\build\\intermediates\\cxx\\Debug\\2y94v28w\\obj\\armeabi-v7a" ^
  "-DCMAKE_BUILD_TYPE=Debug" ^
  "-BC:\\Users\\CHO_YUBIN\\Desktop\\HH\\Kiosker\\App2\\sdk\\.cxx\\Debug\\2y94v28w\\armeabi-v7a" ^
  -GNinja ^
  "-DANDROID_STL=c++_shared"

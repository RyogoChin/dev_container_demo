# dev_container_demo

このリポジトリは、**Dev Containers** を用いた開発環境のデモプロジェクトです。主にJavaを用いたアプリケーション開発をサポートするために設計されており、Dockerfileを活用して簡単にセットアップ可能な開発環境を提供します。

### 使用技術

#### 言語
- **Java**: プロジェクトのメインプログラミング言語。

#### フレームワーク
- **Spring Boot**: 
  - 使用している`starter`モジュール:
    - `spring-boot-starter-data-jpa` (データベースアクセス用)
    - `spring-boot-starter-web` (Webアプリケーション用)
    - `spring-boot-starter-validation` (データ検証用)
    - `spring-boot-starter-test` (テスト用)

#### データベース
- **MySQL**:
  - JDBCドライバーとして`mysql-connector-j`を使用。
  - `Flyway`を利用したマイグレーション設定が含まれています。

#### その他のライブラリ
- **Flyway**: データベースマイグレーションツール（`flyway-core`と`flyway-mysql`を使用）。
- **Lombok**: コード生成ライブラリ（任意設定）。

#### 設定ファイル
- **`application.properties`**
  - Spring Bootアプリケーション名: `dev_container_demo`
  - データベース接続設定 (`spring.datasource`)
  - JPA設定 (`spring.jpa`)
  - Flywayマイグレーション設定 (`spring.flyway`)
- **`db/migration/*.sql`**
  - データベーススキーマの初期化用SQLファイルが含まれています。
  - '1.1'からの原因は
    - 

## 特徴

- ローカル環境を汚さずに、安定した開発環境を構築可能
- Dockerを使用することで、環境依存性を最小限に
- チーム全体で統一された開発環境を簡単に共有可能

## セットアップ手順

以下は、このプロジェクトをローカルでセットアップし、IntelliJ IDEAを使用して開発を開始する手順です。

1. **colimaのインストール**  
   すでにインストール済みであれば飛す。
   ```bash
   brew install colima
   ```

   colimaの起動。（MシリーズCPUはaarch64おすすめ、x86にすると性能がかなり低くなっちゃう）
   ```bash
   colima start --cpu 4 --memory 8 --disk 100 -a aarch64
   ```

3. **Dockerのインストール**  
   お使いのマシンにDockerがインストールされていることを確認してください。以下のリンクからDockerをインストールできます：
   [Docker公式サイト](https://www.docker.com/get-started)

   インストール完了したら下記でcolimaのコンテクスに設定する。
   ```bash
   docker context use colima
   ```

4. **IntelliJ IDEAの設定**  
   IntelliJ IDEAを開き、以下の手順を実行してください：
   - 「Remote Development」->「Create Dev Container」
     ![image](https://github.com/user-attachments/assets/196a15c4-9b7d-4576-9d8b-bb7bc6775b84)
     ![image](https://github.com/user-attachments/assets/c28cb22a-99e7-4203-bfd5-a8d7095f4b68)

   - 「Docker」の設定開く、daemonをcolimaに、OKを押下
     ![image](https://github.com/user-attachments/assets/08e46e68-b16a-4483-af77-17359713c24d)

   - 「Git Repository」に本RepositoryのGitリンクを貼り付け、「Build Container and Continue」

## 使用方法

1. 開発コンテナ内でコードを編集。
2. コンテナ内でアプリケーションをビルドおよび実行。
3. 必要に応じてテストを追加、自動化。

## 貢献方法

1. このリポジトリをフォークします。
2. `feature-branch` を作成します。
3. 変更をコミットし、プルリクエストを作成します。

## ライセンス

このプロジェクトのライセンスについては、[LICENSE](./LICENSE) ファイルをご確認ください。

## 問い合わせ

質問やフィードバックがある場合は、[Issues](https://github.com/RyogoChin/dev_container_demo/issues) をご利用ください。

package test.test.config

import java.io.File
import java.nio.file.Files
import java.nio.file.Path

class DocumentFileProvider constructor(private val path: String) {

    private val files: ArrayList<DocumentFile> = ArrayList()

    fun init() {
        val directory: Path = File(this.path).toPath()

        if (Files.notExists(directory)) {
            Files.createDirectories(directory)
        }

        this.loadFiles()
    }

    fun add(documentFile: DocumentFile) {
        this.files.add(documentFile)
    }

    private fun loadFiles() {
        this.files.forEach {
            it.load()
        }
    }

    private fun saveFiles() {
        this.files.forEach {
            it.save()
        }
    }

}
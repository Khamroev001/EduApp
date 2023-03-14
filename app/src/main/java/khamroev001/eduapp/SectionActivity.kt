package khamroev001.eduapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import khamroev001.eduapp.adapter.SectionAdapter
import khamroev001.eduapp.databinding.ActivitySectionBinding
import khamroev001.eduapp.model.Section
import khamroev001.eduapp.model.Subject

class SectionActivity : AppCompatActivity() {
    lateinit var binding: ActivitySectionBinding
    lateinit var sections:MutableList<Section>
    lateinit var subjects:MutableList<Subject>
    lateinit var subject:Subject
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySectionBinding.inflate(layoutInflater)
        setContentView(binding.root)
 //  Shakhrizodadan keladi
     var subjectname=intent.getStringExtra("name")

        subjects.add(Subject("Math", mutableListOf(Section("Trigonometriya", mutableListOf()),Section("Planimetriya", mutableListOf()),Section("Stereometriya", mutableListOf()))))
        subjects.add(Subject("Physics", mutableListOf(Section("Trigonometriya", mutableListOf()),Section("Planimetriya", mutableListOf()),Section("Stereometriya", mutableListOf()))))
        subjects.add(Subject("English", mutableListOf(Section("Trigonometriya", mutableListOf()),Section("Planimetriya", mutableListOf()),Section("Stereometriya", mutableListOf()))))
        subjects.add(Subject("Chemistry", mutableListOf(Section("Trigonometriya", mutableListOf()),Section("Planimetriya", mutableListOf()),Section("Stereometriya", mutableListOf()))))



        for (i in subjects){
            if (subjectname==i.name){
                var subject=i
            }
        }

        // subjectni size
        for (i in 0..subject.sections.size-1){
            sections.add(Section(subject.sections[i].name, subject.sections[i].topics))
        }

        var adapter=SectionAdapter(this,sections)
        var layoutManager=LinearLayoutManager(this)

        binding.rv.adapter=adapter
        binding.rv.layoutManager=layoutManager



    }
}
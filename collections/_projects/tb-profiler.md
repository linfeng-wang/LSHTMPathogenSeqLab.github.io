---
layout: default
name: TB-Profiler
pid: tbprofiler
theme: tuberculosis
link:  https://tbdr.lshtm.ac.uk/
people:
  - gnapier
  - jphelan
---

 TB-Profiler - a pipeline which allows users to analyse M. tuberculosis whole genome sequencing data to predict lineage and drug resistance. Follow the instructions below to upload a new sample or view analysed runs. The pipeline searches for small variants and big deletions associated with drug resistance. It will also report the lineage. By default it uses Trimmomatic to trim the reads, BWA (or minimap2 for nanopore) to align to the reference genome and GATK (open source v4) to call variants. 

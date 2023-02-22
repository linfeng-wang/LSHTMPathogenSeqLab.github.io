---
layout: default
name: Malaria-Profiler
theme: 
  - malaria
  - software
pid: mpapp
link: http://bioinformatics.lshtm.ac.uk/malaria-profiler/
people:
  - jthorpe
  - emanko
  - aturkiewicz
  - jphelan
---

Malaria-Profiler - a pipeline which allows users to analyse Plasmodium malaria whole genome sequencing data to predict species and potential drug resistance. Follow the instructions below to upload a new sample or view analysed runs. The pipeline searches for small variants (SNPs and indels) in genes associated with drug resistance. It will also report the species and geographical location. By default it uses Trimmomatic to trim the reads, BWA (or minimap2 for nanopore) to align to the reference genome and freebayes to call variants. 
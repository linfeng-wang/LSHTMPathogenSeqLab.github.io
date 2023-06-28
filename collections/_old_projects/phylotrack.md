---
layout: default
name: PhyloTrack
pid: phylotrack
theme: 
  - tuberculosis
  - software
link:  http://pathogenseq.lshtm.ac.uk/phytblive/index.php
people:
  - jphelan
---


PhyloTrack is a JavaScript--based software tool that integrates the D3.js library for data visualization with the JBrowse tool for genome browser representation. It requires a phylogenetic tree of the common Newick data format as input, as well as three meta data files for samples, clade-defining nodes and clade color definitions - all in tab delimited format. Functionality within PhyloTrack shows the informative markers at each node in the phylogenetic tree, therefore highlighting clade-defining polymorphism. This functionality has been implemented using the tabix tool on the server side, providing simple and rapid access to the information at each tree node, including informative SNPs stored in VCF-similar files. These informative variants have been established by comparing allele frequencies between strain-types using ancestral node comparisons and FST measures of population differentiation.